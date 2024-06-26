import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class LaunchFileWriter1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f1=new File("jamura.txt");
		FileWriter f=new FileWriter(f1,true);//true giving means not changing the existing object only appending new object.
		//writing operation.
		char []ch= {'b','i','p','i','n'};//without true overriden will happend.
		f.write("exist");
		f.write("\n");
		f.write((int)89);
		f.write("\n");
		f.write("tu banja gali banaras ki ");
		f.write("\n");
		f.write(ch);
		f.write("\n");
		f.flush();//make sure compelete the  write operation.
		
//		f.close();
		System.out.println("see the jamura.txt file in the directory");
		
	}

}
