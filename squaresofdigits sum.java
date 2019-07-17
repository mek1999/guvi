import java.util.*;
import java.lang.*;
import java.io.*;
public class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{     int a,s1=1;
     int m=0;
	 int rem = 0;
	 int sum = 0;
     Scanner s=new Scanner(System.in);
     a=s.nextInt();
     while (a != 0)
     {
		rem = a % 10;
		sum = sum + (rem * rem);
		a = a / 10;
     }
     System.out.println(sum);
	}
}
