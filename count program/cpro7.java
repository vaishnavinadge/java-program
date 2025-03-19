class cpro7
{
  public static void main(String args[])
  {
    int n=5;
    int count = n;
    for(int i=1; i<=n; i++)//i<=5
    {
      
       for(int j=i; j<=n; j++)//j>=1
       { 
          System.out.print(count+" ");
            count--;
       }
       System.out.println();
     
    }
   }
 }