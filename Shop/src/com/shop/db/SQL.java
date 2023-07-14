package com.shop.db;

public class SQL {
	
	// customer
	public static final String SELECT_CUSTOMER = "SELECT * FROM `Customer` WHERE `custID`=?";
	public static final String INSERT_CUSTOMER = "INSERT INTO `Customer` VALUES (?, ?, ?, ?, NOW())";
	
	
	
	// order
	public static final String SELECT_ORDERS = "SELECT "
											 + "a.*,"
											 + "b.`name`,"
											 + "c.`prodName` "
											 + "FROM `Order` AS a "
											 + "JOIN `Customer` AS b ON a.orderId = b.custId "
											 + "JOIN `Product` AS c ON a.orderProduct = c.prodNo "
											 + "WHERE `orderId`=?";
	public final static String INSERT_ORDER = "INSERT INTO `order` SET "
											+ "`orderId`=?,"
											+ "`orderProduct`=?,"
											+ "`orderCount`=?,"
											+ "`orderDate`=NOW()";
	
	// product
	public static final String SELECT_PRODUCT  = "SELECT * FROM `Product` WHERE `prodNo`=?";
	public static final String SELECT_PRODUCTS = "SELECT * FROM `Product` WHERE `stock` > 0";
	public final static String UPDATE_PRODUCT_STOCK = "UPDATE `Product` SET `stock` = `stock` - ? WHERE `prodNo`=?";
	
	
	
}
