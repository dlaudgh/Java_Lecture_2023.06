package ch11_API.sec04_string;

public class Ex07_Substring {

	public static void main(String[] args) {
		String ssn = "880823-1234567";
		
		String firstPart = ssn.substring(0, 6);
		System.out.println(firstPart); 			// 880823
		
		String secondPart = ssn.substring(7);
		System.out.println(secondPart); 		// 1234567
		
		// 생년월일을 "1988-08-23" 형태로 바꾸기
//		String ymd = "";
//		if (ssn.charAt(7) == '1' || ssn.charAt(7) == '2')
//			ymd = "19";
//		else
//			ymd = "20";
		String ymd = (ssn.charAt(7) == '1' || ssn.charAt(7) == '2') ? "19" : "20";
		ymd += ssn.substring(0,2) + "-" + ssn.substring(2,4) + "-" + ssn.substring(4,6);
		System.out.println(ymd);
	}

}
