package classesandobjects;

abstract class Calcultor{
    public abstract void sum(int a,int b);
    public abstract void sub(int a,int b);
    public abstract void mul(int a,int b);
    public abstract void div(int a,int b);
    void m() {
   	 
   	 
    }
}

class CalImp extends Calcultor{

    @Override
    public void sum(int a, int b) {
   	 
   	 System.out.println(a+b);
    }

    @Override
    public void sub(int a, int b) {
   	
   	 System.out.println(a-b);
    }

    @Override
    public void mul(int a, int b) {
   	 
   	 System.out.println(a*b);
    }

    @Override
    public void div(int a, int b) {
   	 
   	 System.out.println(a/b);
    }
    
    
}


public class Abstraction{
    public static void main(String[] args) {
   	 CalImp imp=new CalImp();
   	 imp.sum(12, 13);
   	 imp.sub(14, 11);
    }
}
