import java.util.*;
public class K{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        int n=sc.nextInt();
        float e;
        if(n<=199)
        {
            e=n*1.20f;
        }
        else if(n>=200 &&n<400)
        {
            e=n*1.50f;
        }
        else if(n>=400 &&n<600)
        {
            e=n*1.80f;
        }
        else 
        {
            e=n*2.00f;
        }
        if(e>=400)
        {
            e=e+0.15f*e;
            System.out.printf("%.2f",e);
        }
        else{
            e=e+100;
            System.out.printf("%.2f",e);
        }
    }
}