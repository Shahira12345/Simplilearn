package queue;

import java.io.IOException;
import java.util.Scanner;
public class Queue{
    
    public static void main(String[] args) throws IOException {
   	 Scanner sc=new Scanner(System.in);
   	 System.out.println("eneter the size of the Queue");
   	 int sizeOfQueue=sc.nextInt();
   	 int queue[]=new int[sizeOfQueue];
   	 int front=-1;
   	 int rear=-1;
   	 System.out.println("Queue operation");
   	 while(true) {
   	 System.out.println("enter your choice of Queue 1.enqueue 2.dequeue 3.display 4.exit");
   	 int choice=sc.nextInt();
   	 switch(choice) {
   	 case 1:if(rear==sizeOfQueue-1) {
   		 System.out.println("queue is full no more insertion");
   	 }
   	 else {
   		 System.out.println("eneter the element to insert");
   		 int key=sc.nextInt();
   		 rear=rear+1;
   		 queue[rear]=key;
   		 front=0;
   	 }
   		 break;
   	 case 2:if(front>rear|| (front==-1&&rear==-1)) {
   		 System.out.println("queue cannot be deleted further");
   	 }
   	 else {
   		 front=front+1;
   	 }
   		 break;
   	 case 3: if(front>rear || (front==-1&&rear==-1)) {
   		 System.out.println("queue is empty");
   	 }
   	 else {
   		 
   		 for(int i=front;i<=rear;i++) {
   		 System.out.println(queue[i]);
   	 }
   	 }
   	 break;
   	 case 4: System.exit(0);
   		 break;
   	 default: System.out.println("check the option and retry");
   		 break;
   			 
   	 }
   	 
   	 
   	 
   	 }
   	 
   	 
}
}




