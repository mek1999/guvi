import java.util.*;
import java.lang.*;
import java.io.*;
public class Ideone 
{
	public static void main(String[] args)
    {
	 Scanner in = new Scanner(System.in);
     String line = in.nextLine();
	 String uppercaseline=""; 
     Scanner lineScan = new Scanner(line); 
     while(lineScan.hasNext()) 
     {
             String word = lineScan.next(); 
             uppercaseline += Character.toUpperCase(word.charAt(0)) + word.substring(1) + " "; 
     }
      System.out.println(uppercaseline.trim()); 
    }
}
