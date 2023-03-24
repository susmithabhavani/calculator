//calculator program 
package com.calculator;
import java.util.Scanner;
public class calculator {
   public static void main(String[]args)
   {
	   
	   Scanner sc=new Scanner(System.in);
			   System.out.println("enter the first number");
	           int a=sc.nextInt();
	           System.out.println("enter the second number");
	           int b=sc.nextInt();
	           System.out.println("enter the operator");
	           String operator=sc.next();
	           
	      switch (operator)
	      {
	      case "+" :
	    	  System.out.println("the result is:"+(a+b));
	    	  break;
	    	  
	      case "-" :
	    	  System.out.println("the result is:"+(a-b));
	    	  break;
	    	  
	      case "*" :
	    	  System.out.println("the result is:"+(a*b));
	    	  break;
	    	  
	      case "/" :
	    	  System.out.println("the result is:"+(a/b));
	    	  break;
	    	  
	      case "%" :
	    	  System.out.println("the result is:"+(a%b));
	    	  break;  
	    	  
	    	  default:
	    		  System.out.println("please enter  valid operator");
	      }
	           
   }
}
   
