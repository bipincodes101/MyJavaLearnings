//this code snippets for with in a class .
public class WithInAClass {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int a;
			int b;
	Champ ch=new Champ();
	ch.display("java is great");
	}
	

}
class Champ{
	void display() {//1.if no specifier is present then default is called accessed within a class.
		
	}
	private int display(int a) {//2.it can accessed within a class.
		System.out.println(a);
		return -1;
	}
	protected int display(int a,int b) {//3.it can accessed within a class.
		
		System.out.println(a);
		System.out.println(b);
		return -1;
	}
	public String display(String name) {//4.it can accessed within a class.
		display(10,20);
		display(30);
		return null;
		
	}
}
