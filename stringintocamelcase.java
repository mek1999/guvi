import java.util.*;
import java.lang.*;
import java.io.*;
public class Ideone 
{
	public static void main(String[] args)
    {
	 Scanner s = new Scanner(System.in);
     String line = s.nextLine();
	 String uppercase=""; 
     Scanner lineScan = new Scanner(line); 
     while(lineScan.hasNext()) 
     {
         String word = lineScan.next(); 
         uppercase+= Character.toUpperCase(word.charAt(0)) + word.substring(1) + " "; 
     }
      System.out.println(uppercase.trim()); 
    }
}
