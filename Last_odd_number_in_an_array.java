import java.util.Scanner;
public class K{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int m=0;
        for(int i=0;i<n;i++)
        {
            if(a[i]%2!=0)
            {
                m=a[i];
            }
        }
        System.out.println(m);
        
    }
}