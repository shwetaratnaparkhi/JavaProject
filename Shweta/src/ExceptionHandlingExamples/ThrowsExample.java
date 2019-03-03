package ExceptionHandlingExamples;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;
      ////this program is for to read line from notepad////
public class ThrowsExample {
	
	 public static void main(String[]args) throws IOException 
	 {
     FileReader file = new FileReader("C:\\test\\a.txt");
	 BufferedReader fileInput = new BufferedReader(file);
	 
	 //print first 3 lines of file "C:\\test\\a.txt"
	 for (int Counter =0; Counter<3; Counter++)
		 System.out.println(fileInput.readLine());
			 fileInput.close();
	 }
}

