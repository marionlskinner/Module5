package cen3024;

import java.io.*;
import java.util.*;

public class Module5_Recursive {
	
	
	public static long fibonacci (long n) {
	      if ((n == 0) || (n == 1))
	         return n;
	      else
	         return fibonacci(n - 1) + fibonacci(n - 2);
	   }
	   public static void main(String[] args) {
	      System.out.println("The 0th fibonacci number is: " + fibonacci(0));
	      System.out.print("time in nanoseconds = ");
	      System.out.println(System.nanoTime());
	      System.out.println();
	      System.out.println("The 1st fibonacci number is: " + fibonacci(1));
	      System.out.print("time in nanoseconds = ");
	      System.out.println(System.nanoTime());
	      System.out.println();
	      System.out.println("The 2nd fibonacci number is: " + fibonacci(2));
	      System.out.print("time in nanoseconds = ");
	      System.out.println(System.nanoTime());
	      System.out.println();
	      System.out.println("The 3rd fibonacci number is: " + fibonacci(3));
	      System.out.print("time in nanoseconds = ");
	      System.out.println(System.nanoTime());
	      System.out.println();
	      System.out.println("The 4th fibonacci number is: " + fibonacci(4));
	      System.out.print("time in nanoseconds = ");
	      System.out.println(System.nanoTime());
	      System.out.println();
	      System.out.println("The 5th fibonacci number is: " + fibonacci(5));
	      System.out.print("time in nanoseconds = ");
	      System.out.println(System.nanoTime());
	      System.out.println();
	      System.out.println("The 6th fibonacci number is: " + fibonacci(6));
	      System.out.print("time in nanoseconds = ");
	      System.out.println(System.nanoTime());
	      System.out.println();
	      System.out.println("The 7th fibonacci number is: " + fibonacci(7));
	      System.out.print("time in nanoseconds = ");
	      System.out.println(System.nanoTime());
	      System.out.println();
	      System.out.println("The 8th fibonacci number is: " + fibonacci(8));
	      System.out.print("time in nanoseconds = ");
	      System.out.println(System.nanoTime());
	      System.out.println();
	      System.out.println("The 9th fibonacci number is: " + fibonacci(9));
	      System.out.print("time in nanoseconds = ");
	      System.out.println(System.nanoTime());
	      System.out.println();
	      System.out.println("The 10th fibonacci number is: " + fibonacci(10));
	      System.out.print("time in nanoseconds = ");
	      System.out.println(System.nanoTime());
	      
	   }

}
