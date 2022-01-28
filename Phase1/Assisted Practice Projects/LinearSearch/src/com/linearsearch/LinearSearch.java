package com.linearsearch;

import java.io.IOException;
import java.util.Scanner;

public class LinearSearch
{
	static int linearSearch(int a[],int key)
	{
	   	 int i=0;
	   	 for(i=0;i<a.length;i++) 
	   	 {
	   		 if(a[i]==key)
	   		 {
	   			 break;
	   		 }
	   		 
	   	 }
	   	 return i;
	 }
	public static void main(String[] args) throws IOException
	{
		 int a[]= {2,5,6,7,9,12,15,56,78};
		 Scanner sc=new Scanner(System.in);
	   	 System.out.println("enter a key value to search");
	   	 int key=sc.nextInt();
	   	 System.out.println("the position of the key value "+key+ "is at :"+linearSearch(a, key));
	   	 
	   	 
	}

}
