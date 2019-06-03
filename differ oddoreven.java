import java.io.*;
import java.util.*;
import java.lang.*;
public class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n,m;
		n=sc.nextInt();
		m=sc.nextInt();
		if((n-m)%2==0)
		{
			System.out.print("even");
		}
		else
		{
			System.out.print("odd");
		}
	}
	
}
