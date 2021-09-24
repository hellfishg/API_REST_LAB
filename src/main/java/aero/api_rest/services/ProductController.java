package aero.api_rest.services;

import aero.api_rest.models.Product;
import aero.api_rest.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("products")
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @GetMapping()
    public ResponseEntity<List<Product>> list(){
        List<Product> list = (List<Product>) productRepository.findAll();
        return new ResponseEntity<>(list, HttpStatus.OK);
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/create")
    public Product create(@RequestBody Product product) {
        return productRepository.save(product);
    }
}
