package assignment;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num1, num2;
		System.out.println("���� 2���� �Է����ּ���: ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		int plus = num1 + num2;
		int sub = num1 - num2;
		int multi = num1 * num2;
		int div = num1 / num2;
		int remain = num1 % num2;
		System.out.println("����: " + plus);
		System.out.println("����: " + sub);
		System.out.println("����: " + multi);
		System.out.println("������: " + div);
		System.out.println("������: " + remain);
	}

}
