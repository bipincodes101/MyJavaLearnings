import java.util.Scanner;
public class Launch2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		try {
			System.out.println("enter the number which divides 100");
			int num=sc.nextInt();
			int divide=100/num;
			System.out.println("enter the size of array:");
			int size =sc.nextInt();
		   int []arr=new int [size];
		   System.out.println("enter ther array element:");
		   int element =sc.nextInt();
		   System.out.println("enter the array position where you want to put the element");
			int postion =sc.nextInt();
			arr[postion]=element;
	}
		
	catch(ArithmeticException ae){
		System.out.println("give right denominator");
	}
	catch(NegativeArraySizeException nsae){
		System.out.println("array size is negative");
	}
	catch(ArrayIndexOutOfBoundsException aiobe) {
		System.out.println("your array index out of bound");
	}
	catch(Exception e) {
		System.out.println("you do something wrong");
	}
		System.out.println("program is terminated");
		
		
	}

}
