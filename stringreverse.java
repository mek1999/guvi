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
		String s1,reverse="";
        s1=s.nextLine();
        int len =s1.length();
        for(int i = len - 1 ; i >= 0 ; i--) 
        {
            reverse = reverse + s1.charAt(i);
        }
		System.out.println(""+reverse);
		// your code goes here
	}
}
