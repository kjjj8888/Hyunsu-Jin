package assignment;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num1, num2;
		System.out.println("¼ıÀÚ 2°³¸¦ ÀÔ·ÂÇØÁÖ¼¼¿ä: ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		int plus = num1 + num2;
		int sub = num1 - num2;
		int multi = num1 * num2;
		int div = num1 / num2;
		int remain = num1 % num2;
		System.out.println("µ¡¼À: " + plus);
		System.out.println("»¬¼À: " + sub);
		System.out.println("°ö¼À: " + multi);
		System.out.println("³ª´°¼À: " + div);
		System.out.println("³ª¸ÓÁö: " + remain);
	}

}
