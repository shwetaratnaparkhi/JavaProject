package Files.properties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertiesfile {

	public static void main(String[] args) throws IOException
	{
		FileInputStream file=new FileInputStream("C:\\Users\\user\\eclipse-workspace\\Shweta\\src\\Files\\properties\\ObjectRepo.properties");
	
		Properties or= new Properties();
		or.load(file);
		

		System.out.println(or.getProperty("username"));
		System.out.println(or.getProperty("password"));
		System.out.println(or.getProperty("login"));
		
	}

}
