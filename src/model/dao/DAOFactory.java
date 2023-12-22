package model.dao;

import db.DB;
import model.dao.impl.DepartmentDAO_JDBC;
import model.dao.impl.SellerDAO_JDBC;

public class DAOFactory {

	public static SellerDAO createSellerDAO() {
		return new SellerDAO_JDBC(DB.getConnection());
	}
	
	public static DepartmentDAO createDepartmentDAO() {
		return new DepartmentDAO_JDBC(DB.getConnection());
	}
}
