package aero.api_rest.controllers;

import aero.api_rest.models.Product;
import aero.api_rest.models.ProductDTO;
import aero.api_rest.repositories.ProductRepository;
import aero.api_rest.services.DollarPriceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.List;

import static aero.api_rest.utils.Constants.TIME_SETTING_FOR_NEW_PRODUCTS;

@RestController
@RequestMapping("products")
public class ProductsController {

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private DollarPriceService dollarPriceService;

    @GetMapping()
    public ResponseEntity<List<ProductDTO>> list() {
        List<ProductDTO> productDTOList = new ArrayList<>();
        BigDecimal rateDollar = BigDecimal.valueOf(dollarPriceService.getDollarRateARS());
        productRepository.findAll()
                        .forEach(e -> productDTOList.add(new ProductDTO()
                        .createProductDTO(e, e.getPrice().divide(rateDollar, RoundingMode.HALF_UP)))
                );
        return new ResponseEntity<>(productDTOList, HttpStatus.OK);
    }

    @GetMapping("/new_products")
    public ResponseEntity<List<Product>> listOfNewProducts() {
        LocalDate localDateNow = LocalDate.now(ZoneId.of("UTC-3"));
        LocalDate monthAgo = LocalDate.now(ZoneId.of("UTC-3")).minusMonths(TIME_SETTING_FOR_NEW_PRODUCTS);
        List<Product> products = productRepository.findByDates(localDateNow, monthAgo).get();
        return new ResponseEntity<>(products, HttpStatus.ACCEPTED);
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/create")
    public Product create(@RequestBody Product product) {
        product.setUpdatedAt(LocalDate.now(ZoneId.of("UTC-3")));
        return productRepository.save(product);
    }
}
