package innerclass;

abstract class Bike
{
abstract void speed();    
}
public class AnonymousIC 
{
	public static void main(String[] args) 
	{
	   	 Bike b=new Bike()
	   	 {

	   		 @Override
	   		 void speed()
	   		 {
	   			 System.out.println("the speed of bike is 20km /hr");
	   			 
	   		 }
	   		 
	   		 
	   	 };
	   	 
	   	 b.speed();
	   	 
	    }

}
