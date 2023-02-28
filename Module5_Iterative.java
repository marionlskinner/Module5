package cen3024;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;  

class Module5_Iterative {
	public static void main(String[] args) throws IOException
    {
        System.out.print("Enter How many Fibonacci numbers you want to print: "); 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(br.readLine());
    	
        System.out.println("First " + number +" Fibonacci numbers are: "); 
    	
        for(int i=1; i<=number; i++)
        { 
            System.out.print(iterativeFib(i) +" "); 
        }
    }
    
    public static int iterativeFib(int number)
    { 

        if(number == 1 || number == 2)
        {
            return 1; 
        }
    	
        int num1 = 1, num2 = 1, fibonacci = 1; 
    	
        for(int i= 3; i<= number; i++)
        { 
            fibonacci = num1 + num2; 
            num1 = num2; 
            num2 = fibonacci; 
        }	
        System.out.print("time in nanoseconds = ");
	      System.out.println(System.nanoTime());
        return fibonacci;
    }
    
    
} 
