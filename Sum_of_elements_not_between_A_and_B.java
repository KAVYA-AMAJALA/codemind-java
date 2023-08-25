import java.util.Scanner;
public class k{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i,sum=0;
        int[] arr=new int[n];
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int a=sc.nextInt();
        int b=sc.nextInt();
        for(i=0;i<n;i++)
        {
            if(arr[i]>=a && arr[i]<=b)
            {
                continue;
            }
            else{
                sum+=arr[i];
            }
        }
        System.out.println(sum);
        
        
        
    }
}