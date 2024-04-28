class Parent{
	public void display() {
		System.out.println("parent have great ability of understanding");
	}
}
class Child1 extends Parent{
	public void display() {
		System.out.println("child1 have minimum ability of understanding");
	}
}
class Child2 extends Parent{
	public void display() {
		System.out.println("maximum ability then child1");
	}
}

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Child1 c=new Child1();//this is known as tight coupling.
	Parent c=new Child1();
		Parent ch=new Child2();//it is loose coupling.
		Parent ref;
		ref=c;
		ref.display();
		ref=ch;
		ref.display();
	}

}
