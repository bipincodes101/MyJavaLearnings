//swapping without third variable.
package ArrayQuestion;

public class Swapping {
	public static void main(String[]args) {
		
		int a=5;
		System.out.println("a is :"+a);
		int b=7;
		System.out.println("b is :"+b);
		a=a+b;
		
		b=a-b;
		System.out.println(" now b is :"+b);
		a=a-b;
		System.out.println("now a is :"+a);
	}
}
