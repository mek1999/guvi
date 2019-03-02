import java.util.*;
import java.lang.*;
import java.io.*;
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int count=1;
		String str;
		Scanner s=new Scanner(System.in);
		str=s.nextLine();
		for (int i = 0; i < str.length() - 1; i++)
		{
			if ((str.charAt(i) == ' ') && (str.charAt(i + 1) != ' '))
			{
				count++;
 
			}
		}    
		System.out.println(""+ count);
		
	}
}
