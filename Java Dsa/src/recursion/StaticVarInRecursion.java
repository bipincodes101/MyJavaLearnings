package recursion;

public class StaticVarInRecursion {
     static  int x=0;
	public static void main(String[] args) {
	
		int a=5;
		int result=fun(a);
		System.out.println(result);

	}
	private static  int fun(int n) {
		if(n>0) {
			x++;
			return fun(n-1)+x;
		}
		return 0;
	}
}
