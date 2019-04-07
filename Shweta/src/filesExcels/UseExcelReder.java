package filesExcels;

import java.io.IOException;

public class UseExcelReder {

	public static void main(String[] args) throws IOException
	
	{
		Xls_Reader xl=new Xls_Reader(System.getProperty("user.dir")+"\\TestData.xls");
		
     String str= xl.getCellData("Sheet1", 1, 1);
     System.out.println(str);
     
     String str2= xl.getCellData("Sheet1", 2, "UserName");
     System.out.println(str2);
      int rows=xl.getrowcount("Sheet1");
      System.out.println(rows);
     int cols=xl.getColumncount("Sheet1");
     System.out.println(cols);
     for(int r=2; r<=rows;  r++)
     {
    	 for(int c=1; c<=cols; c++)
    	 
    	 {
    		System.out.println(xl.getCellData("Sheet1", r, c)); 
    	 }
    	 
     }
     
     
	}

}
