import java.io.PrintWriter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class Requirement2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		PrintWriter pw=new PrintWriter("data3.txt");
		BufferedReader br1=new BufferedReader(new FileReader("data1.txt"));
		String line1=br1.readLine();
		BufferedReader br2=new BufferedReader(new FileReader("data2.txt"));
		String line2=br2.readLine();
		while(line1!=null || line2!=null) {
			if(line1!=null) {
				pw.println(line1);
				line1=br1.readLine();
			}
			if(line2!=null) {
				pw.println(line2);
				line2=br2.readLine();
			}
		}
		pw.flush();
		br1.close();
		br2.close();
		System.out.println("open data3.txt file to see the output");
	}

}
