package ch06_class;

import java.time.LocalDate;

public class Ex03_CustomerMethod {

	public static void main(String[] args) {
		Customer customer = genCustomer();
		printCustomer(customer);
	}

	static Customer genCustomer() {
		int cid = 1001;
		String name = "James";
		int age = 23;
		LocalDate today = LocalDate.now();
		boolean adult = true;
		Customer customer = new Customer(cid, name, age, today);
		customer.setAdult(adult);
		return customer;
	}
	static void printCustomer(Customer c) {
		System.out.println(c);
	}
}
