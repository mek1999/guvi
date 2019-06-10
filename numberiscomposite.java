import java.io.*;
import java.util.*;
import java.lang.*;
public class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int a,n=0;
		a=sc.nextInt();
		for(int i=1;i<=a;i++)
		{
			if(a%i==0)
			{
				n++;
			}
		}
		if(n>2)
		{
			System.out.print("yes");
		}
		else
		{
			System.out.print("no");
		}
	}
 
}
