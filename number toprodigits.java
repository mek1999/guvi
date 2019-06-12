import java.util.*;
import java.lang.*;
import java.io.*;
public class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s=new Scanner(System.in);
		int n,p=1,m;
		int i=0;
		String a;
		n=s.nextInt();
		a=String.valueOf(n);
    	char b[]=a.toCharArray();
    	m=b.length;
		while(i<m)
    	{
     		p=p*b[i];
     		i++;
    	}
   		System.out.print(p);
	}
}
