package exceptions;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Filenotfoundexception {

	public static void main(String[] args) throws IOException {
		File f=new File("C:\\Users\\Admin\\Desktop\\new.txt");
		try {
			FileReader fr=new FileReader(f); //to open the file
			int temp=0;
			while((temp=fr.read())!=-1) { //read one character at a time
				System.out.println((char) (temp)); //char convert to readable character
			}
		}
		catch(IOException i) {
			System.out.println(i.getMessage());
			}
		finally {
			System.out.println("exception is handled");
		}
	}
}
