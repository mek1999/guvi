import java.util.*;
import java.lang.*;
import java.io.*;
public class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s=new Scanner(System.in);
		int n,m,a;
		n=s.nextInt();
		m=s.nextInt();
		a=n+m;
		if(a%2!=0)
		{
			System.out.print("odd");
		}
		else
		{
			System.out.print("even");
		}
	}
}
