package assignment;
import java.util.Scanner;
public class Integer_or_Double_typed_Input {

	public static void main(String[] args) {
		
		int num;
		double dnum;
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		dnum = sc.nextDouble();
		System.out.println("num: " + num);
		System.out.println("dnum:" + dnum);
		
		//plus 13
		int x = 10 + 3;
		System.out.println(x);
		// sub 7
		x = 10 - 3;
		System.out.println(x);
		// multi 30
		x = 10 * 3;
		System.out.println(x);
		// div 3
		x = 10 / 3;
		System.out.println(x);
		// remain 1;
		x = 10 % 3;
		System.out.println(x);
	}

}
