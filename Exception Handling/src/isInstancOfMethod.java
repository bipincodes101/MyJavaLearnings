
public class isInstancOfMethod {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		Demo d=new Demo();
		System.out.println(d instanceof Demo);
		System.out.println(Class.forName(args[0]).isInstance(d));
	}

}
