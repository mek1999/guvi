import java.io.*;
import java.util.*;
import java.lang.*;
public class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{ 
		Scanner s=new Scanner(System.in);
		int n,l,r;
		n=s.nextInt();
		l=s.nextInt();
		r=s.nextInt();
		if(n>l)
		{
			if(n<r)
			{
				System.out.print("yes");    
			}
			else    
			{
				System.out.print("no");   
			}
		}
		else
		{
			System.out.print("no");
		}
	}
			
}  
