import java.util.*;
import java.lang.*;
import java.io.*;
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int count=0;
		String str;
		Scanner s=new Scanner(System.in);
		str=s.nextLine();
		for(int i = 0; i < str.length(); i++)
		{    
            if(str.charAt(i) != ' ')    
                count++;    
        }    
		System.out.println(""+ count);
		
	}
}    


