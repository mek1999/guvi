import java.io.*;
import java.util.*;
import java.lang.*;
public class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{ 
		String a,b="";
		Scanner s=new Scanner(System.in);
		a=s.nextLine();
		char c[]=a.toCharArray();
		for(int i=c.length-1;i>=0;i--)
		{
			b=b+c[i];
		}
		if(a.equals(b))
		{
		   System.out.print("yes");    
		}
		else    
		{
			System.out.print("no");   
		}
	}  
}
