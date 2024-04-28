//private member not participate in inheritance.
class Jubin{
	 int a;
	private int b;
	void display() {
		a=7;
		System.out.println("private member"+a);
	}
}
class Jubin1 extends Jubin{
	 void show() {
		 a=6;
		 System.out.println(a);
	 }
}
class Jubin2 extends Jubin1{
	
}
public class Limitation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Jubin2 j=new Jubin2();
		j.display();
		j.show();
	}

}
