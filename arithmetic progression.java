import java.util.*;
import java.lang.*;
import java.io.*;
public class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
        Scanner s=new Scanner(System.in);
        int a,b,c,an;
        a=s.nextInt();
        b=s.nextInt();
		c=s.nextInt();
		an=((c/2)*(2*a+(c-1)*b));
		System.out.print(an);
	}
}
