import java.util.*;
import java.lang.*;
import java.io.*;
public class day_yes_or_no
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s=new Scanner(System.in);
		String day1="Saturday";
		String day2="Sunday";
		String a;
		a=s.next();
		if((a.equals(day1))||(a.equals(day2)))
		{
			System.out.print("yes");
		}
		else
		{
			System.out.print("no");
		}
	}
}
