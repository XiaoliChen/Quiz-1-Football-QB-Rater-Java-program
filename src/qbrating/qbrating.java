package qbrating;

import java.util.Scanner;

public class qbrating {	 
	public static void main(String[] args)
{
	Scanner input = new Scanner(System.in);
System.out.print("Enter number of passing attempsts: ");
double att=input.nextDouble();

System.out.print("Enter number of completions:");
double comp =input.nextDouble();

System.out.print("Enter the passing yards:");
double yds=input.nextDouble();

System.out.print("Enter the touchdown passes:");
double td=input.nextDouble();

System.out.print("Enter the interceptions:");
double inter=input.nextDouble();

			

double a = (((comp / att) * 100) - 30) * .05;
		        if (a < 0)
		         a = 0;
		        else if (a> 2.375)
		            a = 2.375;
		        
		   double b= ((yds / att) - 3) * .25;
		        if (b < 0)
		            b = 0;
		        else if (b > 2.375)
		            b = 2.375;
  
		   double c= ((td / att) * .2) * 100;
		        if (c > 2.375)
		        	c = 2.375;
		   
		   double d= 2.375 - (((inter / att) *.25) * 100);
		        if (d < 0)
		        	d = 2.375;
		        else if (d > 2.375)
		        	d = 2.375;
		    double passerResult = ((a + b + c + d) / 6) * 100;
		    
		    
		    
		  System.out.println("The quarterback's passing rate is " + passerResult);
		  
		 
}
}
