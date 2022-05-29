package com.sky.repository;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.sky.domain.Product;

@Repository
public class ProductRepositoryImpl implements ProductRepository {
	private static List<Product> products = new ArrayList<Product>();

	@Override
	public void addProduct(Product product) {
		System.out.println("in repository");
		products.add(product);
	}

	@Override
	public List<Product> getProducts() {
		return products;
	}

	@Override
	public Product getProductById(String id) {
		for (Product product : products) {
			if (product.getProductId().equals(id)) {
				System.out.println(product);
				return product;
			}
		}
		return null;
	}

//	@Override
//	public boolean deleteByProductId(String id) {
//		for (Product product : products) {
//			if (product.getProductId().equals(id)) {
//				return products.remove(product);
//			}
//		}
//		return false;
//	}

	@Override
	public void deleteByProductId(String id) {
		int index=0;
		for(Product del: products) {
		if(del.getProductId().equals(id)) {
			products.remove(index);   ////list of objects
			
		}
		index=index +1;
		}
	}

	@Override
	public void updateByProductId(Product newproduct) {
		int index=0;
		for(Product product1: products) {
			System.out.println("update");
		if(product1.getProductId().equals(newproduct.getProductId())){
			products.set(index,newproduct);
			
//			return newproduct;
		}
		index=index +1;
	}
//		return null;
	}

}

