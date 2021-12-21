import java.util.Scanner;
public class CaloriesBurned {
       public static void main(String [] args)
       {  
    	   int choose = 100;
           double weight = 0;
           int mod = 0;
           double time = 0;
           Scanner input = new Scanner(System.in);
    	   System.out.println("Please choose the Gym Equipment for calories burned calulation: ");
    	   
    	   System.out.println("1: Bicycles.");
    	   System.out.println("2: Chest Press.");
    	   System.out.println("3: Abdominal Machine. ");
    	   System.out.println("4: Leg Press.");
    	   System.out.println("5: Shoulder Press.");
    	   System.out.println("6: Squat Racks.");
    	   System.out.println("7: Ropes.");
    	   System.out.println("8: Dumbells.");
    	   System.out.println("9: Elliptical.");
    	   System.out.println("10: T Redmill.");
    	   System.out.println("11: Stair Stepper.");
    	   choose = input.nextInt();
    	   switch (choose)
    	   {
    	   case 11: 
    		   System.out.println("Please input your weight in kg: ");
    		   weight = input.nextDouble();
    		   
    		   System.out.println("Please input your how many minutes you spend in this equipement");
    		   time = input.nextDouble();
    		   System.out.println("Your calories burned for this equipment is " + CaloriesBurning(weight, choose, time));
    		   break;
    	   case 1:
    		   System.out.println("Please input your weight in kg: ");
    		   weight = input.nextDouble();
    		   System.out.println("Please input your how many minutes you spend in this equipement");
    		   time = input.nextDouble();
    		   System.out.println("Your calories burned for this equipment is " + CaloriesBurning(weight, choose, time));
    		   break;
    	   case 2:
    		   System.out.println("Please input your weight in kg: ");
    		   weight = input.nextDouble();
    		   System.out.println("Please input your how many minutes you spend in this equipement");
    		   time = input.nextDouble();
    		   System.out.println("Your calories burned for this equipment is " + CaloriesBurning(weight, choose, time));
    		   break;
    	   case 3:
    		   System.out.println("Please input your weight in kg: ");
    		   weight = input.nextDouble();
    		   System.out.println("Please input your how many minutes you spend in this equipement");
    		   time = input.nextDouble();
    		   System.out.println("Your calories burned for this equipment is " + CaloriesBurning(weight, choose, time));
    		   break;
    	   case 4:
    		   System.out.println("Please input your weight in kg: ");
    		   weight = input.nextDouble();
    		   System.out.println("Please input your how many minutes you spend in this equipement");
    		   time = input.nextDouble();
    		   System.out.println("Your calories burned for this equipment is " + CaloriesBurning(weight, choose, time));
    		   break;
    	   case 5:
    		   System.out.println("Please input your weight in kg: ");
    		   weight = input.nextDouble();
    		   System.out.println("Please input your how many minutes you spend in this equipement");
    		   time = input.nextDouble();
    		   System.out.println("Your calories burned for this equipment is " + CaloriesBurning(weight, choose, time));
    		   break;
    	   case 6:
    		   System.out.println("Please input your weight in kg: ");
    		   weight = input.nextDouble();
    		   System.out.println("Please input your how many minutes you spend in this equipement");
    		   time = input.nextDouble();
    		   System.out.println("Your calories burned for this equipment is " + CaloriesBurning(weight, choose, time));
    		   break;
    	   case 7:
    		   System.out.println("Please input your weight in kg: ");
    		   weight = input.nextDouble();
    		   System.out.println("Please input your how many minutes you spend in this equipement");
    		   time = input.nextDouble();
    		   System.out.println("Your calories burned for this equipment is " + CaloriesBurning(weight, choose, time));
    		   break;
    	   case 8:
    		   System.out.println("Please input your weight in kg: ");
    		   weight = input.nextDouble();
    		   System.out.println("Please input your how many minutes you spend in this equipement");
    		   time = input.nextDouble();
    		   System.out.println("Your calories burned for this equipment is " + CaloriesBurning(weight, choose, time));
    		   break;
    	   case 9:
    		   System.out.println("Please input your weight in kg: ");
    		   weight = input.nextDouble();
    		   System.out.println("Please input your how many minutes you spend in this equipement");
    		   time = input.nextDouble();
    		   System.out.println("Your calories burned for this equipment is " + CaloriesBurning(weight, choose, time));
    		   break;
    	   case 10:
    		   System.out.println("Please input your weight in kg: ");
    		   weight = input.nextDouble();
    		   System.out.println("Please input your how many minutes you spend in this equipement");
    		   time = input.nextDouble();
    		   System.out.println("Your calories burned for this equipment is " + CaloriesBurning(weight, choose, time));
    		   break;
    		   
    	   }
       }
       public static double CaloriesBurning(double weight, int choose, double time)
       {  double burned = 0;
          if(choose == 11)
          {
        	burned = 3.5 * weight * 3.5 / 200 * time;
          }
          if(choose == 1)
          {
        	burned = 3.5 * weight * 8.5 / 200 * time;
          }
          if(choose == 2)
          {
        	burned = 3.5 * weight * 14 / 200 * time;
          }
          if(choose == 3)
          {
        	burned = 3.5 * weight * 15 / 200 * time;
          }
          if(choose == 4)
          {
        	burned = 3.5 * weight * 11 / 200 * time;
          }
          if(choose == 5)
          {
        	burned = 3.5 * weight * 13 / 200 * time;
          }
          if(choose == 6)
          {
        	burned = 3.5 * weight * 5 / 200 * time;
          }
          if(choose == 7)
          {
        	burned = 3.5 * weight * 7 / 200 * time;
          }
          if(choose == 8)
          {
        	burned = 3.5 * weight * 4 / 200 * time;
          }
          if(choose == 9)
          {
        	burned = 3.5 * weight * 8 / 200 * time;
          }
          if(choose == 10)
          {
        	burned = 3.5 * weight * 11 / 200 * time;
          }
    	  return burned; 
       }
     
       
}
