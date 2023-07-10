package mysql.ex07_bbs;

import java.util.List;

import org.mindrot.bcrypt.BCrypt;

import mysql.ex07_bbs.dao.UserDao;
import mysql.ex07_bbs.entity.User;
import mysql.ex07_bbs.service.UserService;

public class UserTest {

	public static void main(String[] args) {
		UserDao uDao = new UserDao();
		User james = new User("james","james","제임스","james@google.com");
		User maria = new User("maria","maria","마리아","maria@google.com");
		
		uDao.insertUser(james);
		uDao.insertUser(maria);
		
		List<User> list = uDao.getUserList(10, 0);
		for (User u: list)
			System.out.println(u);
		System.out.println("==========================================");
		
		james = uDao.getUser("james");
		maria = uDao.getUser("maria");
		
		// 패스워드 변경
		String jamesPwd = BCrypt.hashpw(james.getPassword(), BCrypt.gensalt());
		String mariaPwd = BCrypt.hashpw(maria.getPassword(), BCrypt.gensalt());
		james.setPassword(jamesPwd);
		maria.setPassword(mariaPwd);
		uDao.updateUser(james);
		uDao.updateUser(maria);
		
		list = uDao.getUserList(10, 0);
		for (User u: list)
			System.out.println(u);
		System.out.println("==========================================");
		
		// 마리아 삭제
//		uDao.deleteUser("maria");
//		list = uDao.getUserList(10, 0);
//		for (User u: list)
//			System.out.println(u);
		
		UserService us = new UserService();
		System.out.println(us.login("james", "james"));		// CORRECT_LOGIN = 0
		System.out.println(us.login("james", "maria"));		// WRONG_PASSWORD = 1
		System.out.println(us.login("brian", "brian"));		// UID_NOT_EXIST = 2
	}

}
