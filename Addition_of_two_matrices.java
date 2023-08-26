import java.util.Scanner;
public class K{
   public static void main(String[] args)
        {
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            int[][] arr=new int[n][n];
            int[][] arr1=new int[n][n];
            int[][]  res=new int[n][n];
            int i,j;
            for(i=0;i<n;i++)
            {
                for(j=0;j<n;j++)
                {
                    arr[i][j]=sc.nextInt();
                }
            }
             for(i=0;i<n;i++)
            {
                for(j=0;j<n;j++)
                {
                    arr1[i][j]=sc.nextInt();
                }
            }
            
            for(i=0;i<n;i++)
            {
                for(j=0;j<n;j++)
                {
                   res[i][j]=arr[i][j]+arr1[i][j];
               }
            }
            
            for(i=0;i<n;i++)
            {
                for(j=0;j<n;j++)
                {
                   System.out.print(res[i][j]+" ");
               }
               System.out.println();
            }
            
            
        }
}