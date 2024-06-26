import java.io.*;
class Police {
	int num=100;
	int count=0;
	Police(){
		System.out.println("Police constructor is called");
		count++;
	}
}
class Thief extends Police implements Serializable{
	int nums=101;
	int counts=0;
	Thief(){
		System.out.println("thief constructor is called");
		counts++;
	}
}
public class SerialiazionWithInheritance1 {

	public static void main(String[] args) throws IOException,ClassNotFoundException{
		// TODO Auto-generated method stub
		Thief t=new Thief();
		t.num=112;
		t.nums=199;
		System.out.println(t.count+"--->"+t.counts);
		String fileName="fir.ser";
		System.out.println("serialization is started....");
		FileOutputStream fos=new FileOutputStream(fileName);
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(t);
		System.out.println("serialization is ended.....");
		System.in.read();
		System.out.println("de-serialization is started....");
		FileInputStream fis=new FileInputStream(fileName);
		ObjectInputStream ois=new ObjectInputStream(fis);
		Thief t1=(Thief)ois.readObject();
		System.out.println( "count is : "+t1.count+"===>"+"counts is : "+t1.counts);
		System.out.println(t1.num+"==>"+t1.nums);
		System.out.println("de-serialization is ended...");
	}

}
