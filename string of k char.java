import java.util.*;
import java.lang.*;
import java.io.*;
public class String_K_Char
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		String s;
		int k;
		s=sc.nextLine();
		k=sc.nextInt();
		if(s.length()>=k)
		{
			for(int i=0;i<k;i++)
			{
				System.out.print(""+s.charAt(i));
			}
		}
	}
	
}
