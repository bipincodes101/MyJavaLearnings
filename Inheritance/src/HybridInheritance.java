class Jack {
	void display() {
		System.out.println("jack is best");
	}
}
class Jack1 extends Jack{
	
}
class Jack2 extends Jack{
	
}
class Jack3  extends Jack2{
	
}
public class HybridInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Jack3 j=new Jack3();
		j.display();
	}

}
