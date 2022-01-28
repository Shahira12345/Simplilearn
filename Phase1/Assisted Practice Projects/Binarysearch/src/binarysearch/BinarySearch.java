package binarysearch;

import java.io.IOException;
import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) throws IOException 
	{
		int a[]= {2,5,6,7,9,12,15,56,78};
	   	 Scanner sc=new Scanner(System.in);
	   	 System.out.println("enter a key value to search");
	   	 int key=sc.nextInt();
	   	 int low=0;
	   	 int high=a.length-1;
	   	 int mid=0;
	   	 while(low<=high) 
	   	 {
	   		 mid=(low+high)/2;
	   		 if(a[mid]==key) 
	   		 {
	   			 
	   			 System.out.println("element is found at the position "+(mid+1));
	   		 break;
	   		 }
	   		 else if(a[mid]<key) 
	   		 {
	   		
	   			 low=mid+1;
	   			 high=a.length-1;
	   		 }
	   		 else 
	   		 {
			
	   			 low=0;
	   			 high=mid-1;
	   		 }
	   	 } 
	}

}
