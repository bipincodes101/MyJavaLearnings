class Honk1{
	void display() {
		System.out.println("this is honk1");
	}
}
class Honk2 extends Honk1{
	 private  void display() {//we can't reduce the visibility of inherited method.
		System.out.println("this is honk2");
	}
}
public class Visibility {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
