package assignment;

public class Output {
	
	public static void main(String[] args) {
		
		int num = 1;
		double dnum = 3.14;
		System.out.println("press any button");
		System.out.print("Integer Value: " + num + " Double value: " + dnum + "\n");
		System.out.printf("%f\n",dnum);
	    //The difference between println and print is "\n"
		System.out.println("Hello");
		System.out.println("World");
		System.out.print("Hello ");
		System.out.print("World \n");
		System.out.println("abc\t abc\n abc\' abc\" abc\\\n");
		//소숫점 자리표기
		System.out.printf("%.2f\n",3.141592);
		//10진수
		System.out.printf("%d\n",10);
		//8진수
		System.out.printf("%o\n",8);
		//16진수
		System.out.printf("%x\n",16);
		//문자
		System.out.printf("%c\n",'a');
		//문자열
		System.out.printf("%s\n","abc");
		
}
}
