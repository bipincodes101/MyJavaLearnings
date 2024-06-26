@FunctionalInterface
interface Laptop{
	 void display();
//	 void show();
}
public class LaunchAnotation1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Laptop l=()->{
			
		};
		l.display();
		Child c=new Child();
		c.child();
	}

}
//@FunctionalInterface--> here is an error because anotation target is different.
class Parent {
	public void child() {
		System.out.println("child is learning phase");
	}
}
class  Child extends Parent{
	@Override
	public void child() {
		System.out.println("child got job");
	}
}
