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
        int m=-1;
        for(i=0;i<n;i++)
        {
            if(arr[i]>=a && arr[i]<=b)
            {
                continue;
            }
            else{
               
                if(arr[i]>m){
                    m=arr[i];
                }
            }
            
        }
        System.out.println(m);
        
        
        
    }
}