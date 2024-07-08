package fileHandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		// create new file
		try {
			File fo=new File("new-file.txt");
			fo.createNewFile();
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		
		// write into file
		try {
			FileWriter fw=new FileWriter("new-file.txt");
			fw.write("My name is sahadev dahit. I am from Nepal");
			fw.close();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}		
		
		// BufferReader to read from the file
		try {
			BufferedReader br=new BufferedReader(new FileReader("new-file.txt"));
			while(br.ready()) {
				System.out.println(br.readLine());
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		
		//
		
		
		
		
	}

}
