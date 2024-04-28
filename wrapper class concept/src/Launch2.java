class Concept2{
	public void display(float a) {
		System.out.println("widening");
	}
	public void display(int ...a) {
		System.out.println("var-arg method");
	}
}
public class Launch2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Concept2 c2=new Concept2();
		c2.display(5);//implicit type casting int to float .
		c2.display(2,2);//now var-arg is bind.
	}

}
