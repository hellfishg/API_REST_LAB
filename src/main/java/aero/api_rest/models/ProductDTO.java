package aero.api_rest.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;
import java.time.LocalDate;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductDTO implements Serializable {

    @JsonIgnoreProperties
    private Long id;

    @JsonIgnoreProperties
    private String name;

    @JsonIgnoreProperties
    private double price;

    @JsonIgnoreProperties
    private String presentation;

    @JsonIgnoreProperties
    private String brand;

    @JsonIgnoreProperties
    private String photo;

    @JsonIgnoreProperties
    private double originalPrice;

    @JsonIgnoreProperties
    private LocalDate updatedAt;

    @JsonIgnoreProperties
    private double dollarPrice;

    public ProductDTO createProductDTO (Product product, double dollarPrice) {
        this.setId(product.getId());
        this.setName(product.getName());
        this.setPrice(product.getPrice());
        this.setPresentation(product.getPresentation());
        this.setBrand(product.getBrand());
        this.setPhoto(product.getPhoto());
        this.setOriginalPrice(product.getOriginalPrice());
        this.setUpdatedAt(product.getUpdatedAt());
        this.setDollarPrice(dollarPrice);
        return this;
    }

    //Getters And Setters:
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getPresentation() {
        return presentation;
    }

    public void setPresentation(String presentation) {
        this.presentation = presentation;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public double getOriginalPrice() {
        return originalPrice;
    }

    public void setOriginalPrice(double originalPrice) {
        this.originalPrice = originalPrice;
    }

    public LocalDate getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDate updatedAt) {
        this.updatedAt = updatedAt;
    }

    public double getDollarPrice() {
        return dollarPrice;
    }

    public void setDollarPrice(double dollarPrice) {
        this.dollarPrice = dollarPrice;
    }


             /*   "price": 55,
                        "presentation": "170 gr",
                        "brand": "Chocolinas",
                        "photo": "https://challenge-api.aerolab.co/static/products/7790040929906.jpg",
                        "originalPrice": 111.09,
                        "updatedAt": "2021-09-18T10:36:57+00:00"*/

}
