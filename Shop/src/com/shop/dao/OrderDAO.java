package com.shop.dao;

import java.util.List;

import com.shop.db.DBHelper;
import com.shop.vo.OrderVO;

public class OrderDAO extends DBHelper {
	
	// 싱글톤
	private static OrderDAO instance = new OrderDAO();
	public static OrderDAO getInstance() {
		return instance;
	}
	
	// 기본 CRUD 메서드
	public int insertOrder(OrderDAO vo) {
		return 0;
	}
	
	public OrderDAO selectOrder(String orderId) {
		return null;
	}
	
	public List<OrderDAO> selectOrders() {
		return null;
	}
	
	public int updateOrder(OrderVO vo) {
		return 0;
	}
	
	public int deleteOrder(int orderNo) {
		return 0;
	}
	
	
	
}
