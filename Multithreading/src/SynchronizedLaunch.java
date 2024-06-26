class Chandranshu {
	public synchronized void happy(String name) {
		for(int i=0;i<4;i++) {
			System.out.print("chandranshu got girlfriend :");
			try {
				Thread.sleep(2000);
			}
			catch(InterruptedException ie) {
				System.out.println("chandranshu is very strict");
			}
			System.out.println(name);
		}
		
		}
}
class Yash{
	public synchronized void  happy(String identity) {
		for(int i=0;i<4;i++) {
			System.out.print("Yash got girlfriend :");
			try {
				Thread.sleep(2000);
			}
			catch(InterruptedException ie) {
				System.out.println("Yash is very strict");
			}
			System.out.println(identity);
		}
	}
}
class Satyam extends Thread{
	//instance variable
	Chandranshu c;//has -a relationship
	Yash y;
	String name;
	String identity;
	//constructor implemenation
	Satyam(Chandranshu c,String name,Yash y,String identity){
		this.c=c;
		this.y=y;
		this.name=name;
		this.identity=identity;
		
	}
	public void run() {
		c.happy(name);
		y.happy(name);
		
	}
}

public class SynchronizedLaunch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Chandranshu c1=new Chandranshu();
		Chandranshu c2=new Chandranshu();
		Yash y1=new Yash();
		Yash y2=new Yash();
		Satyam s1=new Satyam(c1,"julia",y1,"sindrella");
		Satyam s2=new Satyam(c2,"harmaine",y2,"mariyana");
		s1.start();
		s2.start();
	}

}
