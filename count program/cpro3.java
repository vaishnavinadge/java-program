class cpro3
{
  public static void main(String args[])
  {
    int n=5;
    int count = (n*(n+1))/2;
    for(int i=1; i<=n; i++)//i<=5
    {
      
       for(int j=n; j>=i; j--)//j>=1
       { 
          System.out.print(count+" ");
            count--;
       }
       System.out.println();
     
    }
   }
 }