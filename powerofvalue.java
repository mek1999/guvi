import java.util.*;
import java.lang.*;
import java.io.*;
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int number, i, exponent;
		long power = 1;
		Scanner sc = new Scanner(System.in);
		number = sc.nextInt();	
		exponent = sc.nextInt();	
		for(i = 1; i <= exponent; i++)
		{
			power = power * number;
		}
		System.out.println(+power);
	}
}

