import java.util.*;
import java.lang.*;
import java.io.*;
public class Prime_number_count
{
	public static void main(String[] args) 
	{
        int a,b,count=0;
        Scanner s=new Scanner(System.in);
        a=s.nextInt();
        b=s.nextInt();
        while(a<=b) 
        {
            boolean flag = false;
            for(int i = 2; i <=a/2; ++i)
            {
                if(a% i == 0)
                {
                    flag = true;
                    break;
                }
            }

            if (!flag)
            {
                count++;
            }
            ++a;
            
        }
	System.out.print(count);  
		
	}
    
}
	
