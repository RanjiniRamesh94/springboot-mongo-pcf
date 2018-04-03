package my.learning.service;

import java.util.List;

import my.learning.entity.Product;

public interface ProductService {

	 List<Product> listAllProducts();

	 Product getByProductId(int productId);

	 String createProduct(Product request);

	 String updateProduct(int productId, Product update);

	 String deleteProduct(int productId);

}
