package aero.api_rest.repositories;

import aero.api_rest.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Optional;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

    Product findById(long id);

    Product findByName(String name);

    @Query(value = "SELECT * FROM Product WHERE product.updated_at BETWEEN :monthAgo AND :localDateNow",
            nativeQuery = true)
    Optional<ArrayList<Product>> findByDates(@Param("localDateNow") LocalDate localDateNow,
                                             @Param("monthAgo") LocalDate monthAgo);
}