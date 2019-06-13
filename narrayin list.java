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
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		for(int i=a.length-1;i>=0;i--)
		{
			System.out.print(a[i]+"->");
		}
 }
}
