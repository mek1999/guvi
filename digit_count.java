import java.io.*;
import java.util.*;
public class digit_count
{
    public static void main(String args[])
    {
     String a;
     int n;
     int m=0;
     Scanner s=new Scanner(System.in);
     n=s.nextInt();
     a=String.valueOf(n);
     char b[]=a.toCharArray();
     m=b.length;
     System.out.print(m);
	}
}
