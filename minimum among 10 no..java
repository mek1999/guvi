#include <stdio.h>
int main(void)
{
  	int a[10],i=0,j=0;
  	for(i=0;i<10;i++)
  	{
  		scanf("%d",&a[i]);
  	}
  	for(i=0;i<10;i++)
    {
      for(j=0;j<10;j++)
      {
        	if(a[i]<a[j])
      		{
              int temp=0;
              temp=a[i];
              a[i]=a[j];
              a[j]=temp;
            }
       }
     }
  	 printf("%d",a[0]);
    return 0;
}
