package assignment;

import java.util.Scanner;

public class Fahrenheit_to_Celsius {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("ȭ���µ��� �Է��ϼ���: ");
		double f_tem, c_tem;
		f_tem = sc.nextDouble();
		c_tem = (f_tem-32) * 5 / 9;
		System.out.println("�����µ�:" + c_tem);
	}

}
