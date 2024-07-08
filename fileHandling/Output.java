package fileHandling;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Output {
	static void output() {
		try(OutputStreamWriter osw=new OutputStreamWriter(System.out)){
			  osw.write("this is awesome \n");
			  osw.write(97);
		      osw.write(10);
		      osw.write('A');
		      osw.write('\n');
		      
		      char[] arr="This is awesome".toCharArray();
		      osw.write(arr);
		    
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}
		
		// fileWriter methods
		System.out.println("yess");
		try(FileWriter fw=new FileWriter("notes.txt",true)){
			fw.write("this should be appended");
			System.out.println("This is appended");
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}
		
		// bufferedFileWriter
		try(BufferedWriter bw=new BufferedWriter(new FileWriter("notes1.txt"))){
			bw.write("Hare Krishna ");
			System.out.println("Sucessful with buffered reader");
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		output();
	}

}
