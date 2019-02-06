import java.util.*;
import java.lang.*;
import java.io.*;
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int n,k,a[10];
		int i=1,sum=0;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		k=s.nextInt();
		for(i=1;i<=n;i++)
		{
			a[i]=s.nextInt();
		}
		while(i<=k)
		{
			sum=sum+a[i];
			i++;
			
		}
		System.out.println(+sum);
	}
}
