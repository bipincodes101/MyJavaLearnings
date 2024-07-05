package recursion;
public class TreeRecursion {//this is recursion tree.
	public static void main(String[] args) {
		int a=3;
		fun(a);
	}
	public static void fun(int n) {
		if(n>0) {
			System.out.println(n);
			fun(n-1);
			fun(n-1);
		}
	}
}
