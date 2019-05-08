import java.io.*;
import java.util.*;
public class number_digit
{
    public static void main(String args[])
    {
     String a;
     long n;
     Scanner s=new Scanner(System.in);
     n=s.nextLong();
     a=String.valueOf(n);
     char b[]=a.toCharArray();
     for(int i=0;i<b.length;i++)
     {
         System.out.print(b[i]);
	 if(i<b.length-1)
	 {
	 	System.out.print(" ");
     	 } 
     }
    }
}
