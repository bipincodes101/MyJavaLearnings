//we can't create abstract class object.
abstract class Plane {
	abstract public void price();// it is only signature of method.

	public void displayColour() {
		System.out.println("may be any colour");
	}
}

class FighterPlane extends Plane {// if a class extends an abstract class it is mandatory to implement the method
									// of parent class is necessary in child class.or you can make child class as
									// abstract.
	public void price() {
		System.out.println("its price is 5 lakh");
	}

	public void displayColour() {
		System.out.println("colour like a soil colour");
	}
}

class PassengerPlane extends Plane {
	abstract PassengerPlane(){//we can't make constuctor as abstract because its body is mandatory because super method by default present in constructor body.
		
	}

	public void price() {
		System.out.println("its price is 2 lakh");
	}

	public void displayColour() {
		System.out.println("colour is white");
	}
}

abstract class CargoPlane extends Plane {

}

public class Demo2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Plane p1 = new FighterPlane();// we can create refrence of abstract class.
		p1.price();
		p1.displayColour();
		Plane p2 = new PassengerPlane();// Plane is refrence for holding the address of PassengerPlane.
		p2.price();
		p2.displayColour();
		Plane p = new Plane();// abstract class object can't be created.
		// constructor can't be abstract.
	}
}
