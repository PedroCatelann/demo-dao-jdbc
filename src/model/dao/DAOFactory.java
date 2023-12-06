package model.dao;

import model.dao.impl.SellerDAO_JDBC;

public class DAOFactory {

	public static SellerDAO createSellerDAO() {
		return new SellerDAO_JDBC();
	}
}
