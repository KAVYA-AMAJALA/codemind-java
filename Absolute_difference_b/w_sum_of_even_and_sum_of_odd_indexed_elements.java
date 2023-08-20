import java.util.Scanner;
public class k{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        int i;
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int sum1=0;
        for(i=0;i<n;i++)
        {
            if(i%2==0)
            {
              sum1+=a[i]  ;
            }
        }
       
        int sum2=0;
        for(i=0;i<n;i++)
        {
            if(i%2!=0)
            {
                sum2+=a[i];
            }
        }
        
         int ad=sum2-sum1;
         System.out.println(Math.abs(ad));
                
    }
}