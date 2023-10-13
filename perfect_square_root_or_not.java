import java.util.Scanner;
public class K{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int p=0;
        for(int i=1;i<=n/2;i++){
            int s=i*i;
            if(n==s){
               p=1;
            }
        }
        if(p==1){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}