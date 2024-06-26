import java.io.*;
class Animal implements Serializable{
	String name="jungle";
}
class Fox extends Animal{
	String identity="jurman suffer";
}
public class SerializationUsingInheritance {

	public static void main(String[] args)throws IOException,ClassNotFoundException {
		// TODO Auto-generated method stub
		Fox d=new Fox();
		String fileName="doc2.ser";
		System.out.println("serialization is started ...");
		FileOutputStream fos =new FileOutputStream(fileName);
		ObjectOutputStream oos =new ObjectOutputStream(fos);
		oos.writeObject(d);
		System.out.println("serialization is ended...");
		System.in.read();
		System.out.println("de-serialization is started....");
		FileInputStream fis=new FileInputStream(fileName);
		ObjectInputStream ois=new ObjectInputStream(fis);
		Fox d1=(Fox)ois.readObject();
		System.out.println(d1.identity+" : "+d1.name);
		System.out.println("de-serialization is ended...");
	}

}
