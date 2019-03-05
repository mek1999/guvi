import java.util.*;
import java.lang.*;
import java.io.*;
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int a[] = new int[10];
		int temp=0;
		Scanner s=new Scanner(System.in);
		for(int i=0;i<10;i++)
		{
			a[i]=s.nextInt();
		}
		for(int i=0;i<10;i++)
		{
			if(a[i]>temp)
			{
				temp=a[i];
			}
		}
		System.out.println(""+temp);
		
	}
}
