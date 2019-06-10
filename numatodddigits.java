import java.io.*;
import java.util.*;
import java.lang.*;
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
	 String a;
     long n;
     Scanner s=new Scanner(System.in);
     n=s.nextLong();
     a=String.valueOf(n);
     char b[]=a.toCharArray();
     for(int i=0;i<b.length;i++)
     {
     	if(b[i]%2!=0)
     	{
         System.out.print(b[i]+" ");
     	}
	 }
	}
}
