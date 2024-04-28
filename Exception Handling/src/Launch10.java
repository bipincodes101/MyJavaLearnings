class Hagrid{
	void show() {
		try {
			int a=6/0;
			int arr[]=new int[4];
			System.out.println(arr[68]);
			
		
		}
		catch(ArrayIndexOutOfBoundsException ae) {
			System.out.println("exception caught in show method or hagrid class");
		}
		finally {
			System.out.println("program is terminated");
		}
		
	}
}
public class Launch10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hagrid h=new Hagrid();
		h.show();
	}

}
