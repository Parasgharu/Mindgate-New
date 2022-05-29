package com.sky.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.sky.domain.Product;
import com.sky.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {
	@Autowired
	@Qualifier("ProductRepositoryDBImpl")
	private ProductRepository productRepository;// = new productRepository

	@Override
	public void addProduct(Product product) {
		System.out.println("in service");
		if (product.getPrice() > 20) {
			productRepository.addProduct(product);
		}
	}

	@Override
	public List<Product> getProducts() {
		return productRepository.getProducts();
	}

	@Override
	public Product getProductById(String id) {
		return productRepository.getProductById(id);
	}

	@Override
	public void deleteByProductId(String id) {
		productRepository.deleteByProductId(id);
	}

	@Override
	public void updateByProductId(Product product) {
		 productRepository.updateByProductId(product);
	}

}
