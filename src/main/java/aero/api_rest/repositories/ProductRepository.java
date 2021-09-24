package aero.api_rest.repositories;

import aero.api_rest.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

    Product findById(long id);

    Product findByName(String name);
}