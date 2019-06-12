import java.util.*;
import java.lang.*;
import java.io.*;
public class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    	int n;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) 
        {
            a[i] = s.nextInt();
        }
        for (int i = 0; i < n; i++) 
        {
            if (a[i] > a[i+1]) 
            {	
            	System.out.print(i);
            }
        }
	}
}
