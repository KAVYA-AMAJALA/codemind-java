import java.util.Scanner;
public class K{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        float sum=0;
        for(float i=1;i<=n;i++)
        {
            sum+=(1/i);
        }
        System.out.printf("%.2f",sum);
        
         
    }
}