import java.util.Vector;
import java.util.Enumeration;
public class VectorLegacyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector v=new Vector();
		v.add(10);
		v.add(10);
		v.add("java");
		v.add('j');
		v.add(10.7);
		Enumeration e=v.elements();
		while(e.hasMoreElements()) {
			System.out.print(e.nextElement()+" ");
		}
				
	}

}
