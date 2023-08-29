import java.util.Scanner;
public class K{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
         for(int i:a){
             int c=0;
             for(int j:a){
                 if(i==j){
                     c++;
                 }
             }
             if(c>(n/2))
        {
            System.out.print(i);
            return;
        }
         }
       
        
       
        
    }
}