import java.util.Scanner;
public class k{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        double a[]=new double[n];
        int i;
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
          double sum=0;
        for(double s:a)
        {
            sum+=s;
        
        }
        double avg=sum/n;
         System.out.printf("%.2f",avg);
    }
}