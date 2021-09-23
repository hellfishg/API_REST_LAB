package aero.api_rest.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Products")
public class ProductModel {

    @Id
    private Integer id;
}
