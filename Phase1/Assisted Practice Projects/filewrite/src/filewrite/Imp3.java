package filewrite;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Imp3 
{
	
	    public static void main(String[] args) throws IOException {
	   	 
	   	 FileInputStream fi=new FileInputStream("a.txt");
	   	 FileOutputStream fo=new FileOutputStream("b.txt");
	   	 
	   	 int i=0;
	   	 
	    while((i=fi.read())!=-1) {
	   	 fo.write(i);
	   	 
	    }
	   	 
	   	 
	    }
	
}
