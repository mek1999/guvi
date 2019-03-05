import java.util.*;
import java.lang.*;
import java.io.*;
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int a=1,b=1,c,n;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		System.out.print(a+" "+b);
		for(int i=2;i<n;i++)
		{
			c=a+b;
			System.out.print(" "+c);
			a=b;
			b=c;
		}
		
	}
}
