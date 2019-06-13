import java.util.*;
import java.lang.*;
import java.io.*;
public class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
        Scanner s=new Scanner(System.in);
		int n,sum=0;
		n=s.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		int i=0;
		while(i<n)
		{
			sum=sum+a[i];
			i+=2;
		}
		System.out.print(sum);
	}
}
