
public class instanceOfOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object t=new Thread();//loose coupling
		System.out.println(t instanceof Object);//true
		System.out.println(t instanceof Runnable);//true
		System.out.println(t instanceof String);//false
		System.out.println(null instanceof String);//false
//		System.out.println(t instanceof String);it give compile time error bcoz no realtionship btw string and thread.
	}

}
