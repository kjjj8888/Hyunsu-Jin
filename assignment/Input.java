package assignment;

import java.util.Scanner;
// Scanner class ���� �ʿ�
public class Input {
	public static void main(String[] ars)
	{
		String str, ch;
		Scanner scan = new Scanner(System.in);
		str = scan.nextLine();
		ch = scan.next();
		//nextLine()�� ���� ��ü�� �Է� ������ next()�� ������ �ֱ��������� �ܾ �޴´�
		System.out.println(str);
		System.out.println(ch);
		
	}
}
