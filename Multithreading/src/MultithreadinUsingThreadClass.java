class Harry extends Thread{
	@Override
	public void run() {
		for(int i=0;i<9;i++) {
			System.out.println("user-defined thread");
			System.out.println(8);
		}
	}
}
public class MultithreadinUsingThreadClass {

	public static void main(String[] args) {//always main thread priority is first. 
		// TODO Auto-generated method stub
		Harry h=new Harry();
		//when we call start method it creates a new thread which call run method.
		h.start();
		for(int i=0;i<9;i++) {
			System.out.println("main thread");
		}
	}

}
