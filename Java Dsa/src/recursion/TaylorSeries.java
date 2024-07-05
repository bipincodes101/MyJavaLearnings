package recursion;

public class TaylorSeries {
	static double p=1;
	static double f=1;
	static double r=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=3;
		int n=90;
	    double result=e(x,n);//e^x=1+x+x/1!+x^2/2!+x^3/3!---x^n/n!;
		System.out.println(result);
	}
	public static double e(int x,int n) {
		if(n==0) {
			return 1;
		}else {
			r=e(x,n-1);
			p=p*x;
			f=f*n;
			return r+p/f;
		}
	}
}
