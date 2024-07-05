package recursion;

public class ExponentialOrPower {

	public static void main(String[] args) {
		int m=2;
		int n=4;
		pow(m,n);
		int result=pow(m,n);
		System.out.println(result);
		int a=1/2;
		System.out.println(a);
		
	}
	public static int pow(int m,int n) {
		if(n==0) {
			return 1;
		}else if(n%2==0) {
			return  pow(m*m,(n/2));
		}else {
			return m*pow(m*m,(n-1)/2);
		}
	}
}
