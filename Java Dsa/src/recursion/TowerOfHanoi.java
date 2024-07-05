package recursion;
import java.util.Scanner;
public class TowerOfHanoi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the total ring number : ");
		int n=sc.nextInt();
		int a=1;
		int b=2;
		int c=3;
		TOH(n,a,b,c);
	}
	public static void TOH(int n,int a,int b,int c) {
		if(n>0) {
			TOH(n-1,a,c,b);
			System.out.println(a+","+c);
			TOH(n-1,b,a,c);
		}
	}
}
