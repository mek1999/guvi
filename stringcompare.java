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
		String s1,s2;
		s1=s.nextLine();
		s2=s.nextLine();
		char s3[]=new char[s1.length()];
		char s4[]=new char[s2.length()];
		int n=s1.length()+s2.length();
        for(int i=0;i<s1.length();i++)
        {
            s3[i]=s1.charAt(i);
        }
        for(int i=0;i<s2.length();i++)
        {
            s4[i]=s2.charAt(i);
        }
      /*  for(int i=0;i<n;i++)
        {
        	if(s3[i]==s4[i])
        	{
        		System.out.println("")
        	}
            s3[i++]=s2.charAt(j);
        }*/
		System.out.println(""+s1+" "+s2);
	}
}
