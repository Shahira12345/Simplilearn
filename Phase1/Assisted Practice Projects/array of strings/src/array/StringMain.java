package array;

public class StringMain{
    public static void main(String[] args) {
   	        	
   	 String input="abcdefghd";
   	 
   	 System.out.println("the string length is: "+ input.length());
   	 
   	 System.out.println("character at a location : "+input.charAt(3));
   	 
   	 System.out.println("get the location of the charcter:"+input.indexOf('d'));
   	 System.out.println("get the last location of the charcter:"+input.lastIndexOf('d'));
   	
   	 System.out.println("convert lower to upper :"+input.toUpperCase());
   	 System.out.println("convert upper to lower :"+input.toLowerCase());
   	 
   	 System.out.println("substring without end point: "+input.substring(0));
   	 System.out.println("substring with a range: "+input.substring(0,4));
   	 
   	 String input1="abcdefgh";
   	 System.out.println("equals over the string:"+input.equals(input1));
   	 
   	
   	 int a=1;
   	 String s=a+"";
   	 String s1=String.valueOf(a);//"1"
   	 String s5=Integer.toString(a);
   	 
   	 char c='a';
   	 String s2=c+"";
   	 String s3=String.valueOf(c);//-->"a"
   	 String s4=Character.toString(c);
   	 
   	 
   	 
   	 String s6="abcd_efgh_ijkl";
   	 String stringArray[]=s6.split("_");
   	 System.out.println(stringArray[1]);
   	 
   	 
   	 
    
    
    }
}
 

