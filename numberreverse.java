import java.util.*;
import java.lang.*;
import java.io.*;
public class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
        Scanner s=new Scanner(System.in);
		int n;
		n=s.nextInt();
		String a;
		a=String.valueOf(n);
        int len =a.length();
        for(int i = len - 1 ; i >= 0 ; i--) 
        {
            	System.out.print(""+a.charAt(i));
        }
  }
}
