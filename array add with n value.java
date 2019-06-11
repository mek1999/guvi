import java.util.*;
import java.lang.*;
import java.io.*;
public class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s=new Scanner(System.in);
		int n,sum=0;
		int[] a=new int[10];
		n=s.nextInt();
		for(int i=1;i<=n;i++)
		{
			a[i]=s.nextInt();
		}
		int i=1;
		while(i<=n)
		{
			sum=sum+a[i];
			i++;
			
		}
		System.out.print(sum);
	}
}
