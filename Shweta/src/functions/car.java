package functions;

public class car
{
	//instance variable
String name;
String model;
int wheels;
String colour;

//constructor
//cortructor help us to initialize variables
public car(String name,String colour,int wheels,String model)
{
	//constructor
	this.name=name;
	this.colour=colour;
	this.wheels=wheels;
	this.model=model;
}
//constructor overloading
public car()
{
	}


//functions of the car
//static function
//constructor donot need written variable
public static void drive()
{
	//car c=new car();
	//System.out.println("the hexa car of model xyz have 4 wheels and in red colour");
	//System.out.println("the "+c.name+" car of model "+c.model+" have "+c.wheels+" wheels and in "+c.colour+" colour");//concetination
}
//non static function

public void transport()
{
	//System.out.println("the hexa car transports passengers from pune to mumbai");//shortcut for =sysout+spacebar
	System.out.println("the "+name+" car transports passengers from pune to mumbai");
	
}
public void specifications()
{
	//System.out.println("the hexa car of model xyz have 4 wheels and in red colour");
	System.out.println("the "+name+" car of model "+model+" have "+wheels+" wheels and in "+colour+" colour");
}
}
