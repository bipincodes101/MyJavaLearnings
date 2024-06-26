import java.io.*;
class Dog implements Serializable{
	public static final long serialVersionUID=6L;//if it mathching both side object is obtained otherwise invalidclasexception is occur.
	String name="jurman suffer";
	int age=8;
	String foods="vegeterian";
}
public class Reciever {

	public static void main(String[] args)throws ClassNotFoundException,IOException {
		// TODO Auto-generated method stub
		System.out.println("de-serialization is started...");
		FileInputStream fis=new FileInputStream("show.ser");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Dog d1=(Dog)ois.readObject();
		System.out.println(d1.name+"==>"+d1.age+"==>"+d1.foods);
		System.out.println("de-serialization is ended...");
	}

}
