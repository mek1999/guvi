import java.util.*;
import java.lang.*;
import java.io.*;
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
	char ch;
	Scanner s=new Scanner(System.in);
	ch=s.next().charAt(0);
  
	 if( (ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z') )
	{
		System.out.println("Alphabet");	
	 }
	else if (ch >= '0' && ch <= '9')
	{
  		System.out.println("No");	
	}    
	 else
      	System.out.println("No");	
	}
}
