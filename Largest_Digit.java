import java.util.Scanner;
public class k{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int lar=0;
        while(n>0)
        {
             int m=n%10;
            if(m>lar)
            {
                lar=m;
            }
            n=n/10;
        }
        System.out.println(lar);
       
    }
}