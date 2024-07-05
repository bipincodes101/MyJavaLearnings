package recursion;

public class Demo1 {
	public static void show(int n) {
		if(n>0) {
			System.out.print(n+",");
			show(n-1);
		} 
	}
	public static void main(String[] args) {
		
		int a=3;
		show(a);
	}
	
}

