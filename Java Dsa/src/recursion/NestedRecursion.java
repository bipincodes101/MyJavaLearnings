package recursion;

public class NestedRecursion {
	public static int fun(int n) {
		if(n>100) {
			return n-10;
		}else {
			return fun(fun(n+11));//nested recursion
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=95;
		int result =fun(a);
		System.out.println(result);
	}

}
