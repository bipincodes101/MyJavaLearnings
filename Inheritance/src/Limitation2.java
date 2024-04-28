//constructor will not participate in inheritance(because its object is not created) but because of super method present in child class constructor called .
class Hook1{
	
	void display() {
		System.out.println("i am method");
	}
	Hook1(){
		
		System.out.println("parent constructor");
	}
}
class Hook2 extends Hook1{
  
	
}
class Hook3 extends Hook2{
	void display() {
		  System.out.println("welcome");
	  }
}

public class Limitation2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hook2 hk=new Hook2();
				hk.display();
		hk.display();
	}

}
