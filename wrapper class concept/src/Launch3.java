class Concept3{
	public void display(Integer i) {
		System.out.println("autoboxing");
	}
	public void display(int ...a) {
		System.out.println("var-arg method");
	}
}
public class Launch3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Concept3 c3=new Concept3();
		c3.display(4);//autoboxing int ==> Integer.
	}

}
