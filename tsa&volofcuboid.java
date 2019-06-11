import java.io.*;
import java.util.*;
import java.lang.*;
public class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
    	Scanner s=new Scanner(System.in);
		int l,b,h;
	    l=s.nextInt();
	    b=s.nextInt();
	    h=s.nextInt();
	    int tsa,v,m,n,o;
	    m=l*b;n=b*h;o=l*h;
	    tsa=2*(m+n+o);
	    v=(m*h);
	    System.out.print(tsa+" "+v);
	}
}
