import java.util.Scanner;
import java.util.Random;

public class Locker {
	 public static void main(String [] args)
     {   int count = 0;
         int leave = 0;
         int index = 0;
		
		 int full = 0;
		 int lockerbox[] = new int[3]; // set there are 50 lockers
		 int uselock;
		 Scanner input = new Scanner(System.in);
		 
		 for(int i= 0; i < 3; i++)
		 {
			 lockerbox[i] = 1;
		 } // let all the locker element equal 1;
		 
	     do
		 {
	     System.out.print("Do you want to use the lock;(Intput: 1)");
		 uselock = input.nextInt();
		 
		 
		 
		 do
		 { 
	     
	     
	     
		 index  = getLocker();
		 
		 //System.out.println(index );
		 
		
		}while(lockerbox[index] == 0);
		 
	     lockerbox[index] = 0;// make sure the last locker element is 0
	     if(full == 0)
		 {
			 System.out.println("The locker " + (index + 1) +" is free to use");
		 }
	     count = 0;
	     for(int j = 0; j < 3; j ++) // check whether lockerbox is full
		 {
	    	  
		 if(lockerbox[j] == 0) 
		 {
			 count++;
			
			 if(count == 3)
			 {
				 full = 1;
				 lockerbox[index] = 1;
				 
			 }
			 
			 
		 }
		 }
	     
	     
		 
		 
	     
		 if(full == 1) {
		 
		 System.out.println("The locker is full, please wait...." );
		                  
		 			      }
		 
		 System.out.println("Do you want use another locker: input 2 for yes");
		 uselock = input.nextInt();	 
		 
		 
		 }
	     while( uselock != 1);
	     System.out.println("There are " + (3-count)
	    		 + " empty locker remand." );
	     System.out.println("Do you want to leave you locker right now. Input: 3 for yes."  );
	     leave = input.nextInt();
	     if(leave == 3)
	     {count--;}
	     System.out.println("Now! There are " + (3-count) + " empty locker remand." );
	     
	     
	     
		 }
	 
	 
	
	 public static int getLocker() 
	 {
		 
		 int a = 0;
		 a = (int) (Math.random()*3);
		 
		 return a;
	 }
}
