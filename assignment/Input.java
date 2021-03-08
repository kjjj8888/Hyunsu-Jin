package assignment;

import java.util.Scanner;
// Scanner class 사용시 필요
public class Input {
	public static void main(String[] ars)
	{
		String str, ch;
		Scanner scan = new Scanner(System.in);
		str = scan.nextLine();
		ch = scan.next();
		//nextLine()은 문장 전체를 입력 받지만 next()는 공백이 있기전까지의 단어를 받는다
		System.out.println(str);
		System.out.println(ch);
		
	}
}
