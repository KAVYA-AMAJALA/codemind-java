import java.util.Scanner;
public class k{
    public static void main(String[] args)
{
    Scanner sc=new Scanner(System.in);
    int n,r,s=0;
    n=sc.nextInt();
    int q=n;
    while(q!=0){    
       r=q%10;
       q=q/10;
       s=s*10+r;
     }
     if(n==s){
     System.out.println("Palindrome");}
     

else{
    System.out.println("Not Palindrome");
    
}
    }
}