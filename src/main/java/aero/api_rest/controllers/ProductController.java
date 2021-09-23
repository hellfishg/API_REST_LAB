package aero.api_rest.controllers;

import aero.api_rest.models.ProductModel;
import aero.api_rest.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("products")
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @GetMapping("/list")
    public ResponseEntity<List<String>> list(){
        List<String> list = new ArrayList<>();
        list.add("Hola como va!");
        return new ResponseEntity<>(list, HttpStatus.OK);
    }

/*    @GetMapping("/create")
    public void create(){
        ProductModel product = new ProductModel();
        product.setName("Zapatillas");
        productRepository.save(product);
    }*/

    @GetMapping("/create")
    public ResponseEntity<?> create() {
        ProductModel product = new ProductModel();
        product.setName("Zapatillas");
        productRepository.save(product);
        return new ResponseEntity<>("Entidad Creada!!", HttpStatus.CREATED);
    }

}
