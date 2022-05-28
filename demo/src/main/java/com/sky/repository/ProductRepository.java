package com.sky.repository;

import java.util.List;

import com.sky.domain.Product;

public interface ProductRepository {
	 public void addProduct(Product product);
	 public List<Product> getProducts();
	 public Product getProductById(String id);
	 public Product deleteByProductId(String id);
	 public Product updateByProductId(Product newproduct);
	 
}
