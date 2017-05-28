package system;

import java.util.*;
import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.After;
import org.junit.Before;

public class SystemTest {

	
	ArrayList<Supplier> spl;
	ArrayList<ShoppingCart> cpl;
	ArrayList<Customer> cul;
	ArrayList<Warehouse> wal;
	ArrayList<Sales> sal;
	ArrayList<Product> ppl;
	ArrayList<Manager> mspl;
	ArrayList<SalesStaff> sspl;
	ArrayList<WarehouseStaff> wspl;
	
	Supplier s1;
	Supplier s2;
	
	Customer c1;
	Customer c2;
	
	Manager m1;
	Manager m2;
	
	Product p1;
	Product p2;
	
	// Warehouse
	Warehouse w1;
	Warehouse w2;
	WarehouseStaff whs1;
	WarehouseStaff whs2;
	
	// Shopping Cart
	ShoppingCart sc1;
	ShoppingCart sc2;

	@Before
	public void setUp()
	{

		
		spl = new ArrayList<Supplier>();
		cpl = new ArrayList<ShoppingCart>();
		cul = new ArrayList<Customer>();
		wal = new ArrayList<Warehouse>();
		sal = new ArrayList<Sales>();
		ppl = new ArrayList<Product>();
		mspl = new ArrayList<Manager>();
		sspl = new ArrayList<SalesStaff>();
		wspl = new ArrayList<WarehouseStaff>();

		//Supplier Test Object
		s1 = new Supplier("s1", "Peter Johns", "XStar Pty Ltd","pj@email.com", "0422333333");
		s2 = new Supplier("s2", "James Schenider", "Fuji Pty Ltd","js@email.com", "0422444444");
		spl.add(s1);
		
		//Customer Test Objects
		c1 = new Customer("Jay Li","c0001","1 Ann St Melbourne", 7434,'M',"170809","jl@email.com",10);
		c2 = new Customer("David Zhang","c0002","1 Burke St Melbourne", 7434,'M',"170809","dz@email.com",7);
		cul.add(c1);
		

		//Product Test Objects
		p1 = new Product(s1, "p001", "banana", "U", 1234, 4.3, 0.0, 5, 0.3);
		p2 = new Product(s2, "p002", "pineapple", "U", 1345, 5.4, 0.3, 6, 0.2);
		ppl.add(p1);
		
		//Manage Test Objects
		m1 = new Manager("m1","Jim Fallon","Management","M",0711,"jf@email.com",0455633,"m0001");
		m2 = new Manager("m2","Tim Kales","Management","M",0677,"tk@email.com",0422342,"m0002");
		mspl.add(m1);
		
		// Warehouse Test Object

		w1 = new Warehouse(p1,30,15,100);
		w2 = new Warehouse(p2,20,10,200);

		whs1 = new WarehouseStaff("w1","Sam Allen","Warehouse","M",0122,"sw@email.com",03445533,"w123123");
		whs2 = new WarehouseStaff("w2","Josh Pop","Warehouse","M",0212,"sw@email.com",03432233,"w456456");
		//Shopping Cart Test Object
		sc1 = new ShoppingCart(c1,p1,"sc001",3);
		//sc2 = new ShoppingCart(c2,p2,"sc002",10);
		cpl.add(sc1);
		
		//spl.add(s1);
		//ppl.add(p1);

	}
	
	@After
	public void programEnd()
	{
		
	}
	
	/* Supplier Class Test
	@Test
	public void supplierTest() {	
		
		assertEquals("s1",s1.getSupplierID());
		s1.updateEmail("PR@Email.com");
		assertEquals("PR@Email.com",s1.getSupplierEmail());
	}
	*/
	/*
	@Test
	public void managerTest() {
		m1.updateProductPrice(ppl, p1, 3.3);
		m1.updateProductBuckDiscount(ppl, p1, 0.2);
		m1.updateProductDiscont(ppl, p1, 0.4);
		assertEquals("Product Price changed",3.3,p1.getProductPrice(),0.001);
		assertEquals("Product Bulk Discount changed",0.2,p1.getBulkDiscount(),0.001);
		assertEquals("Product Discount changed",0.4,p1.getDiscount(),0.001);
	}
	*/

	/*
 	@Test
	public void customerTest()
	{
		c1.updateEmail("pl@email.com");
		c1.updateAddress("123 Count st Boxhill");
		c1.updatePoints(15);
		assertEquals(15,c1.getPoints(),0.0);
		assertEquals("pl@email.com",c1.geteMail());
		assertEquals("123 Count st Boxhill",c1.getAddress());
	}
	*/
	/*
	@Test
	public void productTest()
	{
		p1.updateProductDiscount(0.34);
		p1.updateProductExpiryDate("516");
		p1.updateProductName("watermelon");
		assertEquals(0.34,p1.getDiscount(),0.0);
		assertEquals("watermelon",p1.getProductName());
		
	}
	*/
	/*
	@Test
	public void warehouseTest()
	{	
		assertEquals(70,w1.calcStockSold());
		w1.updateStockLevel(10);
		assertEquals(60,w1.calcStockSold());	
	}
	*/
	
	/*
	@Test
	public void shoppingCartTest()
	{
		
		assertEquals(4.3,sc1.getPrice(),0.001);
		assertEquals(3,sc1.getQuantity(),0.001);
		assertEquals(0.0,sc1.getDiscount(),0.001);
		assertEquals(12.9,sc1.CaculateTotalPrice(),0.001);
	}
	*/

}
