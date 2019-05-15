package ru.astronarh.poc.model;

import org.springframework.data.mongodb.repository.MongoRepository;
import ru.astronarh.poc.dao.Product;

import java.util.List;

public interface ProductRepository extends MongoRepository<Product, String> {
    public Product findById(long id);
    public List<Product> findAll();
}
