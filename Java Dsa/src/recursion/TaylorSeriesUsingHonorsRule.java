package recursion;
import java.util.Scanner;
public class TaylorSeriesUsingHonorsRule {
	static double  s=1;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the value of x : ");
		int x=sc.nextInt();
		System.out.print("enter the value of n : ");
		int n=sc.nextInt();
	double  result =	e(x,n);
	System.out.println(result);

		
		
	}
	public static double e(int x,int n) {
		if(n==0) {
			return s;
		}
		s=1+x*s/n;
		return e(x,n-1);
	}
}
