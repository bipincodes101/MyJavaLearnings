class Monk1{
	String name="swamiviprayanand";
	public void display() {	
		System.out.println(name);
	}	
}
class Monk2 extends Monk1{
	String name="chinmyanand";
	public void display() {
		 
		System.out.println(super.name);
	}
}
public class Monk {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Monk2 mk=new Monk2();
		mk.display();
}
}