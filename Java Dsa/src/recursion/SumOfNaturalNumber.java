package recursion;
import java.util.Scanner;
public class SumOfNaturalNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number: ");
		int num=sc.nextInt();
		int result=sum(num);
		System.out.println(result);
	}
	public static int sum(int n) {
		if(n==0) {
			return 0;
		}else {
			return sum(n-1)+n;
		}
	}
}
