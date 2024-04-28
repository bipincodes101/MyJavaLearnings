//whenever we override static method and reference is parent type it get inherited but child class method get hide only parent method is executed.
class Parent {
	public  static void display() {
		System.out.println("hello java");
	}
	
}
//static can inherited.
class Child extends Parent {
	public static  void display() {
		System.out.println("java programmer");//it method is hided.
	}
	
}
class Child2 extends Child  {
	public static  void display() {
		System.out.println(10+20);
	}
}
public class Launch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child c=new Child2();
		c.display();
		
	}

}
