class Demo{
//	instance variables.
	int age;
	String name;
	
//	static block
	static {
		System.out.println("static block");
	}
	static int x;
	static String str;
	{
		x=5;
		str="java programmer";
	}
	static void display() {
		System.out.println(x);
		System.out.println(str);
	}
	void setAge(int age) {
		this.age=age;
	}
	int getAge() {
		return age;
	}
}





public class Demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo.display();
	}

	
}
