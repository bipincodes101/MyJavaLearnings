class Parent{
	public void m1() throws Throwable {
		
	}
}
class child extends Parent{
	@Override
	public void m1()throws Exception {//if child class throws any checked exception then its compulsorily that parent class throw same exception or its parent . it is not for unchecked exception
		
	}
}
public class OveridenWithException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
