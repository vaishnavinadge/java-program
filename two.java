class two
{
    public static void main(String agrs[])
    {
         int n=5;
         for(int i=1; i<=5; i++)
         {
              for(int j=1; j<=n-i; j++)
              {
                 System.out.print(" "); 
              }
              for(int j=1; j<=i; j++)
              {
                System.out.print("*");
              }
               System.out.println();
         }
         
     
    }


}