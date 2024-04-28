
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer i=new Integer(10);
		int j=i;//automatically conversion from wrapper object to primitive.
		//internally-->int j=i.intValue();		
		System.out.println(j);
		
	}

}
