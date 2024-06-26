import java.io.*;
class Aadhar implements Serializable{
	transient int adharNo=583116;
	 String name="bipin pal";
	 
	private void writeObject(ObjectOutputStream oos)throws IOException {
		oos.defaultWriteObject();
		int encr=adharNo;
		oos.writeObject(encr);	
	}
	private void readObject(ObjectInputStream ois)throws IOException,ClassNotFoundException {
		ois.defaultReadObject();
		int  encrAdh=(int )ois.readObject();
		adharNo=encrAdh;
		
	}
}
public class CustomSerialization1 {

	public static void main(String[] args)throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		Aadhar a=new Aadhar();
		String file="aadhar.ser";
		FileOutputStream fos=new FileOutputStream(file);
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(a);
		
		FileInputStream fis=new FileInputStream(file);
		ObjectInputStream ois=new ObjectInputStream(fis);
		Aadhar a1=(Aadhar)ois.readObject();
		System.out.println("name : "+a1.name);
		System.out.println("adharNO : "+a1.adharNo);
	}

}
