import java.io.*;
import java.util.*;
class digit_count
{
    public static void main(String args[])
    {
     String a;
     int n,s1;
     int m=0;
     Scanner s=new Scanner(System.in);
     n=s.nextInt();
     a=String.valueOf(n);
     char b[]=a.toCharArray();
     for(int i=0;i<b.length;i++)
     {
    	s1=b[i]*b[i];
    	m=m+s1;
     }
     System.out.print(m);
	}
}
