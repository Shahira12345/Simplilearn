package innerclass;

public class Outer 
{
	class Inner
	{
	   	 void display()
	   	 {
	   		 System.out.println("this is inner class");
	   	 }
	    
	}
		public static void main(String[] args)
		{
	   	 Outer out=new Outer();
	   	 Outer.Inner in=out.new Inner();
	   	 in.display();
	   	 
	    }

}
