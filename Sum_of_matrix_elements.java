import java.util.Scanner;
public class k{
    public static void main(String[] args)
{
    Scanner sc=new Scanner(System.in);
    int r,c;
    r=sc.nextInt();
    c=sc.nextInt();
    int[][] a=new int[r][c];
    for(int i=0;i<r;i++)
    {
        for(int j=0;j<c;j++)
        {
            a[i][j]=sc.nextInt();
        }
    }
    int sum=0;
    for(int i=0;i<r;i++)
    {
        for(int j=0;j<c;j++)
        {
            sum+=a[i][j];
        }
    }
    System.out.println(sum);
    }
}