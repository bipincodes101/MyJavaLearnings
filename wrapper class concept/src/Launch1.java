class Concept1 {
	public void display(long a) {
		System.out.println("widening");//means implicit type casting.
	}
	public void display(Integer a) {
		System.out.println("wrapper class");
	}
}
public class Launch1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char a=5;
		boolean flag=false;
		Integer b=5;
		Concept1 c=new Concept1();
		c.display(a);//do implicit type casting done by compier known as widening to long type.
		c.display(b);//wrapper class.
		c.display(flag);//complile time error
	}

}
