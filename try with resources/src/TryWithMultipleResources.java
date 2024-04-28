import java.io.BufferedReader;
import java.io.*;
import java.util.Scanner;

public class TryWithMultipleResources {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (BufferedReader br = new BufferedReader(new FileReader("text"))) {
			br = new BufferedReader(new FileReader("java"));// it can't be reassigned

		} catch (Exception e) {
			System.out.println("heelo");
		}
	}

}
