class Vehicle{
	final int a=5;;
	final void display() {
		a=89;//final variable can't reassigned.
		System.out.println(a);
	}
}
final class Car extends Vehicle{

	void display() {//we can,t override  the final method but it is inhrited
		
	}
}
class bike extends Car{//we can't inherited  the final class.
	
}
public class FinalKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
