package com.shop.dao;

import java.util.List;

import com.shop.db.DBHelper;

public class ProductDAO extends DBHelper {

	// 싱글톤
	private static ProductDAO instance = new ProductDAO();
	public static ProductDAO getInstance() {
		return instance;
	}
	private ProductDAO() {}
	
	// 기본 CRUD 메서드
	public int insertProduct(ProductDAO vo) {
		return 0;
	}
	
	public ProductDAO selectProduct(int prodNo) {
		return null;
	}
	
	public List<ProductDAO> selectProducts() {
		return null;
	}
	
	public int updateProduct() {
		return 0;
	}
	
	public int deleteProduct(int prodNo) {
		return 0;
	}
	
	
	
	
	
	
}
