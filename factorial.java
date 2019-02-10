import java.util.*;
import java.lang.*;
import java.io.*;
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int i,fact,sum=1;
		Scanner s=new Scanner(System.in);
		fact=s.nextInt();
		for(i=1;i<=fact;i++)
		{
			sum=sum*i;
		}
		System.out.println(+sum);
	}
}
