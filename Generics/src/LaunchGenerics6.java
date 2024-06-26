import java.util.TreeSet;
public class LaunchGenerics6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<StringBuffer> ts=new TreeSet();
	/// 1.case	
//		ts.add("java");
//		ts.add("a");
//		ts.add("z");
//		ts.add("d"); 
//		ts.add(null);//null pointer exception.
//		ts.add(10);//class cast exception.
		
		///2.cas3
		ts.add(new StringBuffer("A"));
		ts.add(new StringBuffer("x"));
		ts.add(new StringBuffer("s"));
		ts.add(new StringBuffer("a"));
		ts.add(new StringBuffer("c"));
		
		System.out.println(ts);
		
	}

}
