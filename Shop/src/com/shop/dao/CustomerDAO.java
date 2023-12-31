package com.shop.dao;

import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.List;

import com.shop.db.DBHelper;
import com.shop.db.SQL;
import com.shop.vo.CustomerVO;

public class CustomerDAO extends DBHelper {

	// 싱글톤
	private static CustomerDAO instance = new CustomerDAO();
	public static CustomerDAO getInstance() {
		return instance;
	}
	private CustomerDAO() {}
	
	// 기본 CRUD 메서드
	public int insertCustomer(CustomerVO vo) {

		int result = 0;
		
		try {
			conn = getConnection();
			psmt = conn.prepareStatement(SQL.INSERT_CUSTOMER);
			psmt.setString(1, vo.getCustId());
			psmt.setString(2, vo.getName() );
			psmt.setString(3, vo.getHp());
			psmt.setString(4, vo.getAddr());
			
			// 0:실패, 1:성공
			result = psmt.executeUpdate(); // row count의 결과가 int값으로 나옴
			
			close();
			
		} catch (SQLIntegrityConstraintViolationException e) {
			System.out.println("이미 사용중인 아이디입니다.");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}catch (SQLException e) {
			e.printStackTrace();
		}
		
		return result;
	}
	
	public CustomerVO selectCustomer(String custId) {
		
		CustomerVO vo = null;
		
		try {
			conn = getConnection();
			psmt = conn.prepareStatement(SQL.SELECT_CUSTOMER);
			psmt.setString(1, custId);
			
			rs = psmt.executeQuery();
			
			if(rs.next()) {
				vo = new CustomerVO();
				vo.setCustId(rs.getString(1));
				vo.setName(rs.getString(2));
				vo.setHp(rs.getString(3));
				vo.setAddr(rs.getString(4));
				vo.setRdate(rs.getString(5));
			}
			
			close();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return vo; // try문 안에서 CustomerVo를 선언하면 참조를 못하기때문에 try문 위에 미리 선언해주어야 함.
	}
	
	public List<CustomerVO> selectCustomers() {
		return null;
	}
	
	public int updateCustomer(CustomerVO vo) {
		return 0;
	}
	
	public int deleteCustomer() {
		return 0;
	}
}


















