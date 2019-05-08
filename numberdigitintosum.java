import java.io.*;
import java.util.*;
public class Number_digit
{
    public static void main(String aa[])
    {
     String a;
     long n,m;
     Scanner s=new Scanner(System.in);
     n=s.nextLong();
     a=String.valueOf(n);
     char b[]=a.toCharArray();
     for(int i=1;i<b.length;i++)
	 {
	 	m=b[0];
	 	m=m+b[i];
	 }
     System.out.print(m);
	}
}
