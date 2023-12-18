package application;

import java.util.Date;
import java.util.List;

import model.dao.DAOFactory;
import model.dao.SellerDAO;
import model.entities.Department;
import model.entities.Seller;

public class Program {
	public static void main(String[] args) {
		
		SellerDAO sellerDao = DAOFactory.createSellerDAO();
		
		System.out.println("=== TEST 1: seller findById ===");
		
		Seller seller = sellerDao.findById(3);
		
		System.out.println(seller);
		
		System.out.println("=== TEST 2: seller findByDepartment ===");
		
		Department dep = new Department(2,null);
		
		List<Seller> list = sellerDao.findByDepartment(dep);
		
		for (Seller seller2 : list) {
			System.out.println(seller2);
		}
		
		System.out.println("=== TEST 3: seller findAll ===");
		
		
		list = sellerDao.findAll();
		
		for (Seller seller2 : list) {
			System.out.println(seller2);
		}
		
		System.out.println("=== TEST 4: seller insert ===");
		Seller newSeller = new Seller(null, "Greg", "greg@gmail.com", new Date(), 4000.0, dep);
		sellerDao.insert(newSeller);
		System.out.println("Inserted! new Id = " + newSeller.getId());
		
		System.out.println("=== TEST 5: seller update ===");
		seller = sellerDao.findById(1);
		seller.setName("Joao");
		seller.setEmail("joao@gmail.com");
		seller.setBaseSalary(5000.0);
		seller.setDepartment(dep);
		sellerDao.update(seller);
		System.out.println("Update complete!");
	}
}
