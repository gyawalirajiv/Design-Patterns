package eCommerce;

import java.util.Iterator;
import java.util.List;

public class Application {

	public static void main(String[] args) {

		Category base = new Category("Root");
		Category computer = new Category("Computer");
		Category laptop = new Category("Laptop");
		Category pc = new Category("PC");
		Category phone = new Category("Phone");
		Category iPhone = new Category("iPhone");
		Category android = new Category("Android");

		Product product1 = new Product("Alienware M15", 1200.0);
		Product product2 = new Product("Macbook", 1500.0);
		Product product3 = new Product("Aurora", 2000.0);
		Product product4 = new Product("MSI", 3000.0);
		Product product5 = new Product("iPhone 12", 1000.0);
		Product product6 = new Product("iPhone 13", 2000.0);
		Product product7 = new Product("Samsung S23", 1000.0);
		Product product8 = new Product("Sony X1", 1200.0);

		base.addChild(computer);
		base.addChild(phone);
		computer.addChild(pc);
		computer.addChild(laptop);
		phone.addChild(iPhone);
		phone.addChild(android);

		laptop.addChild(product1);
		laptop.addChild(product2);
		pc.addChild(product3);
		pc.addChild(product4);
		iPhone.addChild(product5);
		iPhone.addChild(product6);
		android.addChild(product7);
		android.addChild(product8);

		base.print();

	}
}
