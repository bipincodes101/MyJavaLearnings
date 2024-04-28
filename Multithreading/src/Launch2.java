class India extends Thread{
	public void start() {
		super.start();
		System.out.println("no arg method");
	}
	public void run() {
		System.out.println("run method");
	}
}
public class Launch2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		India i=new India();
		i.start();
		try {
			i.start();
		}
		catch(Exception e) {
			System.out.println("handling exception");
		}
		
		
		System.out.println("main thread");
	}

}
