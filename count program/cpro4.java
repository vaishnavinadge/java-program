class cpro4 
{
  public static void main(String args[])
  {
    int n=5;
    int count = n;
    for(int i=1; i<=n; i++)
    {
       int c = count;
       for(int j=n; j>=i; j--)//
       { 
          System.out.print(c+" ");
          c+=j-1 ; 
       }
       System.out.println();
       count--;
    }
   }
 }