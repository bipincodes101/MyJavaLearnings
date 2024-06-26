import java.io.*;
public class Requirement1 {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method 
		FileWriter fw=new FileWriter("file1.txt");
		PrintWriter pw1=new PrintWriter(fw);
		pw1.println("aaa");
		pw1.println("bbb");
		pw1.println("ccc");
		FileWriter fw1=new FileWriter("file2.txt");
		PrintWriter pw2=new PrintWriter(fw1);
		pw2.println(111);
		pw2.println(222);
		pw2.println(333);
		PrintWriter pw3=new PrintWriter(fw1);
	}

}
