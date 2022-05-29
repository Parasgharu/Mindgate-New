package com.sky.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.sky.domain.Product;

@Repository("ProductRepositoryDBImpl")
public class ProductRepositoryDBImpl implements ProductRepository {

	private static String INSERT_PRODUCT_SQL="insert into product(product_Id,product_Name,product_price) Values(?,?,?)";
	private static String GET_ALL_PRODUCT ="select product_Id,product_Name,product_price from product ";
	private static String GET_PRODUCT_BY_ID="select product_Id,product_Name,product_price from product where product_Id=?";
	private static String DELETE_PRODUCT_BY_ID="delete from product where product_Id=?";
	private static String UPDATE_PRODUCT_BY_ID="update product set product_Name=?,product_price=? where product_Id=?";
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public void addProduct(Product product) {
		jdbcTemplate.update(INSERT_PRODUCT_SQL,product.getProductId(),product.getProductName(),product.getPrice());
	}

	@Override
	public List<Product> getProducts() {
		return this.jdbcTemplate.query(GET_ALL_PRODUCT, new ProductRowMapper());
	}
	
	private static final class ProductRowMapper implements RowMapper<Product>{
		public Product mapRow (ResultSet rs, int rownum) throws SQLException{
			Product product= new Product();
			product.setProductId(rs.getString("product_Id"));
			product.setProductName(rs.getString("product_Name"));
			product.setPrice(rs.getInt("product_price"));
			return product;
		}
	}
	@Override
	public Product getProductById(String id) {
		return this.jdbcTemplate.queryForObject
				  ( GET_PRODUCT_BY_ID,
				    new Object[]{id}, new ProductRowMapper());
	}

	@Override
	public void deleteByProductId(String id) {
		this.jdbcTemplate.update(DELETE_PRODUCT_BY_ID, id);
	}

	@Override
	public void updateByProductId(Product newproduct) {
		Object[] args= {newproduct.getProductName(),newproduct.getPrice(),newproduct.getProductId()};
		 this.jdbcTemplate.update(UPDATE_PRODUCT_BY_ID,args);
	}

}
