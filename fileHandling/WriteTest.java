package fileHandling;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class WriteTest {
	public static void writeTest() {
		
		// using the OutputStreamWriter
//		try(OutputStreamWriter osr=new OutputStreamWriter(System.out)){
//			osr.write("Everybody wanna steals of girl");
//		}catch(IOException e) {
//			System.out.println(e.getMessage());
//		}
		
		
		// using the FileWriter
//		try(FileWriter fw=new FileWriter("test2.txt")){
//			fw.write("This is awsome");
//			System.out.println("Sucess with the FileWriter");
//		}catch(Exception e) {
//			System.out.println(e.getMessage());
//		}
		
		// using the BufferedWriter		
		try(BufferedWriter bw=new BufferedWriter(new FileWriter("test1.txt"))){
			bw.write("This is from the buffer writer");
			System.out.println("This is awsome");
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		writeTest();
	}

}
