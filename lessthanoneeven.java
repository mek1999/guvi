import java.util.*;
import java.lang.*;
import java.io.*;
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s=new Scanner(System.in);
		int a;
		a=s.nextInt();
		if(a%2!=0)
		{
			a=a-1;
			if(a%2==0)
			{
				System.out.print(a);
			}
		}
		else
		{
			System.out.print(a);
		}
	}
}
