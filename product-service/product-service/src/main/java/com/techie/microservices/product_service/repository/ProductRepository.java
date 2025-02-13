package com.techie.microservices.product_service.repository;

import com.techie.microservices.product_service.model.Product;
// import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends org.springframework.data.mongodb.repository.MongoRepository<Product, String> {

}
