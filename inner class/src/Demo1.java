
public class Demo1 {
	public static void main(String[] args) {
		System.out.println("i am outer class");
		Demo1.Launch.show();
	}
 public class Launch{//this is inner class.
		public static void show() {
			System.out.println("i am inner class method");
		}
		
	}
}
