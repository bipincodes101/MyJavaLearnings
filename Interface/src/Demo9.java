interface IElf {
	// methods by default public and abstract.
	void method1();
}

interface IMorgon {
	void method1();
}

class RingImpl implements IMorgon, IElf {// here only one method is used because method signature and return type is
											// same.
	public void method1() {

	}

	public void method1(int i) {

	}

	public void method1(String n) {

	}

}

public class Demo9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
