import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedWriter;
public class LaunchFileReaderWithBufferWriter {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		FileWriter fw=new FileWriter("myfile.txt",true);
		BufferedWriter bw=new BufferedWriter(fw);
		bw.newLine();
		bw.write(98);
		bw.write("ipin");
		bw.newLine();
		
		bw.write("BCA");
		char []ch= {'R','A','M','A','U','N','I','V','E','R','S','T','Y'};
		bw.newLine();
		bw.write(ch);
		bw.newLine();
		bw.write("namaste bharat");
		bw.newLine();
		bw.write("java is majedar");
		bw.flush();//ensure file operation done successful.
		bw.close();//close the rosource.
		/*fw.close() automatic call by jvm because bw.close() accessing the fw.close()*/
		
	}

}
