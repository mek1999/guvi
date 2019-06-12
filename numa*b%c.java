import java.util.*;
import java.lang.*;
import java.io.*;
public class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s=new Scanner(System.in);
		int a,b,c,m;
		a=s.nextInt();
		b=s.nextInt();
		c=s.nextInt();
		m=((a*b)%c);
		System.out.print(m);
	}
}
