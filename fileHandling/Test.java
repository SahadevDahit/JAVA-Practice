package fileHandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test {
	
	public static void readFile() {
//		try(InputStreamReader isr=new InputStreamReader(System.in)){
//			System.out.println("Enter the message :- ");
//			int letters=isr.read();
//			while(isr.ready()) {
//				System.out.println((char) letters);
//				letters=isr.read();
//			}
//			
//		}catch(IOException e) {
//			System.out.println(e.getMessage());
//		}
		
	// file reader
//		try(FileReader fr=new FileReader("notes.txt")){
//			int letters=fr.read();
//			while(fr.ready()) {
//				System.out.println((char) letters);
//				letters=fr.read();
//			}
//			
//		}catch(IOException e) {
//			System.out.println(e.getMessage());
//		}
//		
		
		// byte to char and read the char or read using the buffered input stream
		try(BufferedReader br=new BufferedReader(new FileReader("notes.txt"))){
			
			while(br.ready()) {
				System.out.println(br.readLine());
				
			}
					
			
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}
		
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 readFile();
	}

}
