package my.learning.repository;



import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import my.learning.entity.Product;

public interface ProductRepo extends MongoRepository<Product, Long> {

public List<Product> findAll();
	
public Product findById(int id);

}
