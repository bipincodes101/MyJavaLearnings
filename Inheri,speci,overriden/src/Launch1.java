class Plane {
	int cap = 400;

	public void landing() {
		System.out.println("plane is landing");
	}

	public void tageOff() {
		System.out.println("plane is taking off");
	}

	public void service() {
		System.out.println("for taking things");
	}

	public void capacity() {

		System.out.println("capacity is:" + cap);
	}
}

class CargoPlane extends Plane {
	public void service() {
		System.out.println("used for loading the goods");
	}

	public void capacity() {
		cap = 100;
		System.out.println("capacity is:" + cap);
	}

	public void colour() {
		System.out.println("dull yellow");
	}
}

class PassengerPlane extends Plane {
	public void service() {
		System.out.println("user for taking passengers");
	}

	public void capacity() {
		cap = 200;
		System.out.println("capacity is:" + cap);
	}

	public void colour() {
		System.out.println("color is white");
	}
}

public class Launch1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CargoPlane cp = new CargoPlane();
		cp.service();//over-riden method --->used with modify.
		cp.capacity();//over-riden method 
		cp.colour();//specialized method. --->not present in parent class but present in child class
		cp.landing();//inherited method. ---> used as it is in child class.
		cp.tageOff();//inherited method.
		System.out.println();
		System.out.println("for passenger plane");
		System.out.println();
		PassengerPlane pp = new PassengerPlane();
		pp.service();//over-riden method
		pp.capacity();//over-riden method
		pp.colour();//specialized method.
		pp.landing();//inherited method.
		pp.tageOff();//inherited method.

	}

}
