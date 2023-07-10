package mysql.ex07_bbs;

import org.mindrot.bcrypt.BCrypt;

public class BCryptExample {

	public static void main(String[] args) {
		String pwd = "1234asdf";
		String cryptedPwd = BCrypt.hashpw(pwd, BCrypt.gensalt());
		System.out.println(cryptedPwd.length() + ", " + cryptedPwd);
		// 60, $2a$10$Lkpu1ugYkH37BLWmN2YbfOonF63dOMpDD50dLOTJ69JM4uXcBx9Sq
		
		// 패스워드가 동일한지 확인
		boolean result = BCrypt.checkpw(pwd, cryptedPwd);
		System.out.println(result);
	}

}
