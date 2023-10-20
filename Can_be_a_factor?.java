import java.util.Scanner;
public class K{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int i;
        for(i=0;i<t;i++){
           int a=sc.nextInt();
           int b=sc.nextInt();
            if(b%a==0 || a*2<b){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}