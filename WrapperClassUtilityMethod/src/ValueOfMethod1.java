
public class ValueOfMethod1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer i=Integer.valueOf("1000",2);
		System.out.println(i);
		//max radix is 36 and min radix is 2.
		Integer i1=Integer.valueOf("100",36);
		System.out.println(i1);
		System.out.println("Min radix is:"+Character.MIN_RADIX);//2
		System.out.println("Max radix is :"+Character.MAX_RADIX);//36
	}

}
