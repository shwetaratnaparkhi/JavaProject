package OopsAbstraction;

public class User 
{
	public static void main(String[] args)
	{//we cannot create object of abstract class
		//new Sprint1();
		
		//Sprint is concrete class thats why we can create object of Sprint3
		MSWord obj=new Sprint3();
		obj.save();
		obj.edit();
		obj.saveAs();
		obj.delete();
		obj.toolBar();
		obj.print();
		
		
		
	}

}
