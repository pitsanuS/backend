package com.kxikw.develop.gable.repository;

import com.kxikw.develop.gable.model.Product;
import org.springframework.data.repository.CrudRepository;


public interface ProductRepository extends CrudRepository<Product, String> {
    @Override
    void delete(Product deleted);
}
