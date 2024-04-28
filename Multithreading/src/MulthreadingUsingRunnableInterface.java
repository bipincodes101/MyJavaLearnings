class Jack implements Runnable{
	public void run() {
		for(int  i=0;i<9;i++) {
			System.out.println("child thread");
		}
	}
	
}
public class MulthreadingUsingRunnableInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Jack j=new Jack();
		Thread t=new Thread(j);//internally Thread(java.lang.Runnable) is called.
		t.start();
		for(int i=0;i<6;i++) {
			System.out.println("main thread");
		}
	}

}
