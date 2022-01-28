package classesandobjects;

class Animal{
    void sleep() {
   	 System.out.println("the animal sleeps");
    }
}
class Cat extends Animal{
    void eat() {
   	 System.out.println("cat do eat");
    }
}

public class Inheritance {
    public static void main(String[] args) {
   	 Cat cat=new Cat();
   	 cat.eat();
   	 cat.sleep();
   	 
   	 
    }
    

}
