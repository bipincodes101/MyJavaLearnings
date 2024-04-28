//in Boolean class content is not important ,case is not important.
//in case insensitive True is treated as true and if and other Strin like"bipin" treated as false.
//and False is false.
public class BooleanClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Boolean b1=new Boolean("True");
		System.out.println(b1);//true
		Boolean b2=new Boolean ("true");
		System.out.println(b2);//true
		Boolean b3= new Boolean ("False");
		System.out.println(b3);//false
		Boolean b4=new Boolean ("bipin");
		System.out.println(b4);//false
		Boolean b5=new Boolean ("FALSE");
		System.out.println(b5);//false
		Boolean b6=new Boolean ("TRUE");
		System.out.println(b6);//true
		Boolean b7=new Boolean ("trus");
		System.out.println(b7);//false
	}

	

}
