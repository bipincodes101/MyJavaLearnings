import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
public class LaunchPrinteWriter {
/*to overcome BufferedWriter and FileWriter Limitation we use PrinterWriter that is writer any type of data*/
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileWriter fw=new FileWriter("intro.txt");
		PrintWriter pw=new PrintWriter(fw);
		pw.write(98);
		pw.write('\n');
		pw.println(98);
		pw.println("bipin");
		pw.println('b');
		pw.println(5.666);
		char []ch= {'a','b'};
		pw.println(ch);
		pw.flush();
		pw.close();
		
	}

}
