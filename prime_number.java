import java.util.Scanner;
public class K{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int p=0;
        for(int i=1;i<=n;i++){
            
            if(n%i==0){
               p++;
            }
        }
        if(p==2){
            System.out.println("prime");
        }
        else{
            System.out.println("not a prime");
        }
    }
}