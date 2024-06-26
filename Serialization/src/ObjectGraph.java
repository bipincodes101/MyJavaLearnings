import java.io.*;
class Dog implements Serializable{
	Cat c=new Cat();
}
class Cat implements Serializable{
	Rat r=new Rat();
}
class Rat implements Serializable {
	String name="juffer";
}
public class ObjectGraph {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		Dog d=new Dog();
		System.out.println("serialization is started....");
		String fileName="doc.ser";
		FileOutputStream fos=new FileOutputStream(fileName);
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(d);
		System.out.println("serialization is ended....");
		System.in.read();
		System.out.println("de-serialization is started.....");
		FileInputStream fis=new FileInputStream(fileName);
		ObjectInputStream ois=new ObjectInputStream(fis);
		Dog d1=(Dog)ois.readObject();
		System.out.println(d1.c.r.name);
		
		System.out.println("de-serialization is ended....");
	}

}
