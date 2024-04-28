
public class Launch1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer i=new Integer(5);
		System.out.println(i);//toString() method is automatically called for returning hash code value of object.
		Integer i2=new Integer("0");
		System.out.println(i2);
		Integer i3=new Integer("ten");//number format exception , Integer class only takes Int type string.
		System.out.println(i3);
		
	}

}
