import java.util.*;
import java.lang.*;
import java.io.*;
public class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s=new Scanner(System.in);
		int i,j;
		i=s.nextInt();
		j=s.nextInt();
		int k = Integer.valueOf(String.valueOf(i) + String.valueOf(j));
		System.out.print(k);
	}
}
