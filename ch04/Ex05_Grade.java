package ch04;

//import java.util.Scanner;

public class Ex05_Grade {

	public static void main(String[] args) {
		int score = 50 + (int) (50 * Math.random());
		
		String grade;
		if (score >= 90)
			{if (score >= 97) {grade = "A+";}
			else if (score >= 93) {grade = "Ao";}
			else {grade = "A-";}}
		else if (score >= 80)
			{if (score >= 87) {grade = "B+";}
		  	else if (score >= 83) {grade = "Bo";}
		  	else {grade = "B-";}}
		else if (score >= 70)
			{if (score >= 77) {grade = "C+";}
		   	else if (score >= 73) {grade = "Co";}
		   	else {grade = "C-";}}
		else if (score >= 60)
			{if (score >= 67) {grade = "D+";}
		   	else if (score >= 63) {grade = "Do";}
		   	else {grade = "D-";}}
		else
			grade = "F";
		System.out.println(score + " " + grade);
		
		
		
//		Scanner scan = new Scanner(System.in);
//		int score = scan.nextInt();
//		scan.close();
//		
//		String grade, aux;
//		if (score % 10 >= 7)
//			aux = "+";
//		else if (score % 10 >= 4)
//			aux = "0";
//		else
//			aux = "-";
//		
//		switch(score / 10) {
//		case 10:
//			grade = "A+"; break;
//		case 9:
//			grade = "A" + aux; break;
//		case 8:
//			grade = "B" + aux; break;
//		case 7:
//			grade = "C" + aux; break;
//		case 6:
//			grade = "D" + aux; break;
//		default:
//			grade = "F";
//		}
//		System.out.printf("점수: %d, 학점: %s\n", score, grade);
	}

}
