import java.io.*;
import javax.security.auth.login.AccountNotFoundException;
class Account implements Serializable{
	String username="palb33184@gmail.com";
	transient String password ="bipin@123";
	///CustomSerialization.
	//creating default serialization
	//this is writeObjectMethod.
	  private void writeObject(ObjectOutputStream oos) throws IOException {
		  //default serialization  is created.
		  oos.defaultWriteObject();
		  String encrPass="123"+ password;
		  oos.writeObject(encrPass);
	  }
	 private void readObject(ObjectInputStream ois)throws ClassNotFoundException, IOException {
		ois.defaultReadObject();
		String encryptPass=(String)ois.readObject();
		password=encryptPass.substring(3);
	}
}
public class CustomSerialization {

	public static void main(String[] args) throws IOException, ClassNotFoundException{
		// TODO Auto-generated method stub
		Account a=new Account();
		System.out.println("Serialization is started...");
		String fileName="doc1.ser";
		FileOutputStream fos=new FileOutputStream(fileName);
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(a);
		System.out.println("serialization is ended....");
		System.in.read();
		System.out.println("de-serialization is started....");
		FileInputStream fis=new FileInputStream(fileName);
		ObjectInputStream ois=new ObjectInputStream(fis);
		Account a1=(Account)ois.readObject();
		System.out.println("username : "+a1.username);
		System.out.println("password : "+a1.password);
		System.out.println("de-serialization is ended....");
	}

}
