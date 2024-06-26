import java.io.BufferedReader;
import java.io.PrintWriter;
import java.io.FileReader;
import java.io.IOException;
public class LaunchBufferedReader {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		PrintWriter pw=new PrintWriter("file3.txt");
		BufferedReader br=new BufferedReader(new FileReader("file1.txt"));
		String line=br.readLine();
		//this is for file1.
		while(line!=null) {
			pw.println(line);
			line=br.readLine();
		}
		br=new BufferedReader(new FileReader("file2.txt"));
		line =br.readLine();
		while(line!=null) {
			pw.println(line);
			line=br.readLine();
		}
		//keep all the data inside the file3.
		pw.flush();
		pw.close();
		br.close();
		System.out.println("open file3.txt file");
	}

}
