package com.sky.service;

import java.util.List;

import com.sky.domain.Product;

public interface ProductService {
	public void addProduct(Product product);
	 public List<Product> getProducts();
	 public Product getProductById(String id);
	 public void deleteByProductId(String id);
	 public void updateByProductId(Product product);
	 
}
