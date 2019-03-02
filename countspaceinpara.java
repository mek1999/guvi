import java.util.*;
import java.lang.*;
import java.io.*;
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int c=0;
		String string;
		Scanner s=new Scanner(System.in);
		string=s.nextLine();
		for (int i = 0; i < string.length(); i++)
		{
			if((string.charAt(i) == ' ')||(string.charAt(i)=='.')) 
			{
				c++;
 
			}
		}    
		System.out.println(""+ c);
		
	}
}
