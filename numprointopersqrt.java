import java.io.*;
import java.util.*;
import java.lang.*;
public class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
    	Scanner s=new Scanner(System.in);
		  int n,m,a;
	  	double b;
	    n=s.nextInt();
	    m=s.nextInt();
	    a=n*m;
	    b=Math.sqrt(a);
    	if(a==(b*b))
   		{
        		System.out.print("yes");
   	 	}
			else
			{
				System.out.print("no");
			}
    }
}
