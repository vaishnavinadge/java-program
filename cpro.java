class cpro
{
  public static void main(String args[])
  {
    int n=5;
    int count =1;
    for(int i=1; i<=n; i++)
    {
       for(int j=i; j<=n;j++)
       { 
          System.out.print(count+" ");
          count++;
       }
       System.out.println();

    }
   }
 }