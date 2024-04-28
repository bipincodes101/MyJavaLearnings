//first class.
class Class1{
	int a;
	String n;
	{
		a=67;
		n="java";
	}
	void display() {
		System.out.println("this is not end");
		System.out.println(a);
	}
}
//second class.
class Class2 extends Class1{
	
}



public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Class2 ref=new Class2();
		ref.display();
		
	}

}
