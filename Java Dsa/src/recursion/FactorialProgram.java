package recursion;

import java.util.Scanner;

public class FactorialProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number: ");
		int num=sc.nextInt();
		int result=factorial(num);
		System.out.println(result);
	}
	public static int factorial(int n) {
		if(n==0) {
			return 1;//because 0!=1
		}else {
			return factorial(n-1)*n;
		}
	}

}
