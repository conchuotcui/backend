package com.ecommerce_project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import java.util.List;
import com.ecommerce_project.model.Review;

@Repository
public interface ReviewRepository extends JpaRepository<Review, Long >{
	@Query("Select r from Review r where r.product.id =: productId")
	public List<Review>getAllProductsRevew(@Param("productld")Long productId);
}
