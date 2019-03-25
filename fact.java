/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
        Scanner s=new Scanner(System.in);
		 int fact=1,n;
		 n=s.nextInt();
        // len =s1.length();
        for(int i =1;i<=n;i++) 
        {
            fact=fact*i;
        }
		System.out.println(""+fact);
		// your code goes here
	}
}
