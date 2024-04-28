
public class Launch {
//	class variables
static int a;
static String name;
//static block
static{
	System.out.println("static block");
}
//static methods
static void display() {
	System.out.println("i am static method");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.out.println("main method");
	display();
	}

}
