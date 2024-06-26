import java.io.*;
class Dog implements Serializable{
	private static final long serialVersionUID = 1L;
	String name="jurman suffer";
	int age=8;	
	String foods="vegeterian";
}
public class Sender {

	public static void main(String[] args) throws IOException ,ClassNotFoundException{
		// TODO Auto-generated method stub
		Dog d=new Dog();
		String fileName="show.ser";
		System.out.println("serialization is started....");
		FileOutputStream fos= new FileOutputStream(fileName);
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(d);
		System.out.println("serialization is ended...");
	}

}
