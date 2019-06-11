import java.io.*;
import java.util.*;
import java.lang.*;
public class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
    	Scanner s=new Scanner(System.in);
		String a;
	    a=s.nextLine();
	    int i=0;
	    while(i<=a.length())
	    {
				System.out.print(""+a.charAt(i));
				i=i+2;
	    }
	    System.out.print(" ");
	    i=1;
	    while(i<=a.length())
	    {
				System.out.print(""+a.charAt(i));
				i=i+2;
	    }
	}
}
