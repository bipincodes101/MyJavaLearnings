class Rawn extends Thread{
	public void run() {
		for(int i=0;i<9;i++) {
			System.out.println("no arg method");
			run(5);
		}
	}
	public void run(int i) {
		for(int j=0;j<4;j++) {
			System.out.println("int arg method");
		}
	}
}
public class Launch1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rawn r=new Rawn();
		r.start();
		
		r.run(5);
		r.run();
		for(int i=0;i<5;i++) {
			System.out.println("main thread");
		}
	}

}
