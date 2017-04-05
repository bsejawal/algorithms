package file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileExample {
	private static final String FS = File.separator;
	public static void main(String[] args) throws IOException {
		String file = "C:"+FS+"Users"+FS+"sejawal"+FS+"Desktop"+FS+"test"+FS+"fromJava.txt";
//		write(file);
//		read(file);
		readUsingScanner(file);
	}
	
	public static void write(String file) throws IOException{
		
		FileWriter fw = new FileWriter(file);
		PrintWriter pw = new PrintWriter(fw);
		pw.println("First line");
		pw.println("Second line");
		pw.println("Third line");
		pw.println("Fourth line");
		pw.close();
	}
	
	public static void read(String file) throws IOException{
		FileReader fr = new FileReader(file);
//		BufferedReader br = new BufferedReader(fr);
		BufferedReader br = new BufferedReader(fr);
		
		
		String str;
		while((str = br.readLine()) != null){
			System.out.println(str);
			
		}
		br.close();
		
	}
	
	public static void readUsingScanner(String file) throws FileNotFoundException{
//		Scanner s = new Scanner(new File(file));
		Scanner s = new Scanner(new BufferedReader(new FileReader(file)));
		
		while(s.hasNext()){

			String a = s.next();
			String b = s.next();
			
			System.out.printf("%s %s\n", a, b);
			
		}
		
		s.close();
		
	}

}
