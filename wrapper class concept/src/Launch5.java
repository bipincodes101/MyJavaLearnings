
public class Launch5 {
	public static void  display(Integer a) {
		System.out.println("auto boxing");
	}
	public static void display(float a) {
		System.out.println("widening");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=5;
		display(a);
	}

}
