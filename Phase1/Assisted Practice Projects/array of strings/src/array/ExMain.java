package array;


import java.util.Scanner;

class ArrayLink{
    void arrayValues(int b[]) {
   	 
   	 System.out.println(b[0]);
   	 
    }
}
public class ExMain{
    public static void main(String[] args) {
   	 int a[]=new int[5];
   	 Scanner sc=new Scanner(System.in);
   	 System.out.println("enter the input values");
   	 
   	 for(int i=0;i<a.length;i++) {
   		 a[i]=sc.nextInt();
   	 }
   	 
   	 ArrayLink al=new ArrayLink();
   	 al.arrayValues(a); 
   	 
    }}

