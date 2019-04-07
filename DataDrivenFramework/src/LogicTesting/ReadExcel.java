package LogicTesting;

import java.io.IOException;

import Library.Xls_Reader;

public class ReadExcel {

	public static void main(String[] args) throws IOException
	{
		Xls_Reader xl=new Xls_Reader(System.getProperty("user.dir")+"\\src\\TestData\\TestData.xls");
		
		String str= xl.getCellData("Sheet1", 1, 1);
		System.out.println(str);
		
		String str2= xl.getCellData("Sheet1", 3, "Username");
		System.out.println(str2);
		
		int row=xl.getrowcount("Sheet1");
		System.out.println(row);
		
		int col= xl.getColumncount("Sheet1");
		System.out.println(col);
		
		for(int r=2; r<=row; r++)
		{
			for(int c=1; c<=col; c++)
			{
				System.out.println(xl.getCellData("Sheet1", r, c)); 
				
			}
		}
	     

	}

}
