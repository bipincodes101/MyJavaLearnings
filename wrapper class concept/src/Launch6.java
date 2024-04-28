
public class Launch6 {
	public static void display(Number a) {
		System.out.println("number class");
	}
	public static void display(Object a) {
		System.out.println("object class");
	}
	public static void display(int ...arg) {
		System.out.println("var-arg method");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=5;
		display(a);
	}

}
