package aero.api_rest.controllers;

import aero.api_rest.models.ProductModel;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("products")
public class ProductController {

    @GetMapping("/list")
    public ResponseEntity<List<String>> list(){
        List<String> list = new ArrayList<>();
        list.add("Hola como va!");
        return new ResponseEntity<>(list, HttpStatus.OK);
    }

    @GetMapping("create")
    public void create(){
        ProductModel product = new ProductModel();
        product.setName("Zapatillas");
    }

}
