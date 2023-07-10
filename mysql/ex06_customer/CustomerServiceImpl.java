package mysql.ex06_customer;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class CustomerServiceImpl implements CustomerService {
	private CustomerDao cDao = new CustomerDao();
	private Scanner scan = new Scanner(System.in);
	
	@Override
	public void listCustomer() {
		List<Customer> list = cDao.getCustomerList();
		for (Customer c: list)
			System.out.println(c);
	}
	
	@Override
	public void registerCustomer() {
		String uid = null;
		while (true) {					// Unique한 uid를 받을 때 까지 반복
			System.out.print("UID> ");
			uid = scan.nextLine();
			Customer c = cDao.getCustomer(uid);
			if (c == null)
				break;
			System.out.println("중복된 ID입니다. 다시 입력하세요.");
		}
		System.out.print("이름> ");
		String uname = scan.nextLine();
		cDao.insertCustomer(new Customer(uid, uname));
		System.out.println("고객 등록을 마쳤습니다.");
	}
	
	@Override
	public void updateCustomer() {
		Customer c = null;
		String uid = null;
		while (true) {
			System.out.print("UID> ");
			uid = scan.nextLine();
			c = cDao.getCustomer(uid);
			if (c != null)
				break;
			System.out.println("잘못된 ID입니다. 다시 입력하세요.");
		}
		System.out.print("이름 (" + c.getUname() + ")> ");
		String uname = scan.nextLine();
		System.out.print("등록일 (" + c.getRegDate().toString() + ")> ");
		String regDate = scan.nextLine();
		c = new Customer(uid, uname, LocalDate.parse(regDate), 0);
		cDao.updateCustomer(c);
		System.out.println("고객정보 수정을 마쳤습니다.");
	}
	
	@Override
	public void deleteCustomer() {
		String uid = null;
		while (true) {
			System.out.print("UID> ");
			uid = scan.nextLine();
			Customer c = cDao.getCustomer(uid);
			if (c != null)
				break;
			System.out.println("잘못된 ID입니다. 다시 입력하세요.");
		}
		cDao.deleteCustomer(uid);
		System.out.println("고객 탈퇴를 마쳤습니다.");
	}
}