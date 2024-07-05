package recursion;
import java.util.Scanner;
public class CombinationUsingRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value of n : ");
		int n=sc.nextInt();
		System.out.println("enter the value of r : ");
		int r=sc.nextInt();
		int result=combination(n,r);
		System.out.println(result);
	}
	public static int combination(int n,int r) {
		if(r==0||r==n) {
			return 1;
		}else {
			return combination(n-1,r-1)+combination(n-1,r);
		}
	}

}
