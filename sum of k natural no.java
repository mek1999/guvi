import java.util.*;
import java.lang.*;
import java.io.*;
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s=new Scanner(System.in);
		long k,sum=0;
		k=s.nextLong();
		if(k>0)
		{
			for(int i=1;i<=k;i++)
			{
				sum=sum+i;
			}
			System.out.print(sum);
		}
		else
		{
			System.out.print("");
		}
	}
}
