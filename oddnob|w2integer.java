import java.util.*;
import java.lang.*;
import java.io.*;
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{	
		int i,n,q;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		q=s.nextInt();
		for (i =n+1; i <q; i++) 
		{
			if (i % 2 != 0) 
			{
				System.out.print(i+" ");
			}
		}
	}
}
