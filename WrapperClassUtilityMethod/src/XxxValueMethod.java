
public class XxxValueMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Its for only primitive integer type.
		Integer i=new Integer(140);
		System.out.println(i.byteValue());//converting in byte type.  -116.
		System.out.println(i.shortValue());//converting in short type.  140.
		System.out.println(i.floatValue());//converting in float type. 140.0
		System.out.println(i.intValue());//converting in int.   140
		System.out.println(i.doubleValue());//converting in double.   140.0
		System.out.println(i.longValue());//convertin in long    140
		
		//converting character class into primitive type.
		Character c=new Character('a');
		System.out.println(c.charValue());//a 
		
		Boolean b=new Boolean (true);
		b=false;
		System.out.println(b.booleanValue());//false
	}

}
