
class Demo3 {
	public void display() {
		System.out.println("i am outer class");
		
		
	}
	static class Launch { //inner class.
		public void display() {
			System.out.println("yeh! inner class is showing");
		}
	}
	
}

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo3 d3 = new Demo3();// object of outer class.
		d3.display();

//		Demo3.Launch l;// creating the object of inner class using outer class refrence.
//		l = d3.new Launch();
//		l.display();

		Demo3.Launch l1;// creatin the object of inner class using class name.
		l1 = new Demo3.Launch();
		l1.display();

	}

}
