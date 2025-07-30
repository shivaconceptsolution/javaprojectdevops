class ForEachLoop
{
   public static void main(String args[])
   {
       int x[][] = {{1,2},{3,4}};
       for(int i=0;i<2;i++)
       {
         for(int j=0;j<2;j++)
         {
              System.out.print(x[i][j] + " ");
         }
         System.out.println();
       }


   }


}