package com.cs.CrudMongoDB.repositories;

import com.cs.CrudMongoDB.models.ProductDTO;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProductDAO extends MongoRepository<ProductDTO, String> {
}
