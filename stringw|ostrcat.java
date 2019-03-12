import java.util.*;
import java.lang.*;
import java.io.*;
class Concatenation
{
    public static void main(String []args) throws IOException
    {
        Scanner s=new Scanner(System.in);
        int i=0;
        String s1,s2;
        s1=s.nextLine();
        s2=s.nextLine();
        char s3[]=new char[s1.length()+s2.length()];
        for(;i<s1.length();i++)
        {
            s3[i]=s1.charAt(i);
        }
        for(int j=0;j<s2.length();j++)
        {
            s3[i++]=s2.charAt(j);
        }
        System.out.println(""+new String(s3));
    }
}
