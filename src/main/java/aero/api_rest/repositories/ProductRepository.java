package aero.api_rest.repositories;

import aero.api_rest.models.ProductModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends CrudRepository<ProductModel, Long> {

    ProductModel findById(long id);

    ProductModel findByName(String name);
}