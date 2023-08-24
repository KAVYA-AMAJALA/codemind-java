import java.util.Scanner;
public class k{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int  n=sc.nextInt();
        int i;
        int[] arr=new int[n];
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int odd=0;
        for(i=0;i<n;i++)
        {
            if(arr[i]%2!=0)
            {
                odd++;
            }
        }
        if(odd<=2)
        {
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
        
    }
}