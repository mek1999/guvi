import java.util.*;
import java.lang.*;
import java.io.*;
public class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{ 
		String a;
		Scanner s=new Scanner(System.in);
		a=s.nextLine();
		char c[]=a.toCharArray();
		int count=0;
		for(int i=0;i<c.length;i++)
		{
			if(c[i]=='a'||c[i]=='e'||c[i]=='i'||c[i]=='o'||c[i]=='u')  
			{
				count++;
			}
		}  
		if(count>0)
		{
				System.out.print("yes");
		}
		else    
		{
				System.out.print("no");   
		}
	}
}
