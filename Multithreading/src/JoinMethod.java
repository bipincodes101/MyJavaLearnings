class Esklard extends Thread{
	public void run() {
		for(int i=0;i<6;i++) {
			System.out.println("boy thread ");
			try {
				Thread.sleep(2000);//pause the execution for 2 sec.
			}catch(InterruptedException e) {
				System.out.println("some interruption");
			}
		}
	}
}
//class Elva extends Thread{
//	public void run() {
//		
//		for(int i=0;i<6;i++) {
//			System.out.println("girl thread ");
//		}
//	}
//}
public class JoinMethod {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		Esklard e=new Esklard();
		e.start();
		e.join(1000 );//waiting for child thread.
		for(int i=0;i<6;i++) {
			System.out.println( "girl thread ");
		}
	}

}
