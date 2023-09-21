import java.util.Scanner;
public class K{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        int i,j;
        for( i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int m=0;
        for( i=0;i<n;i++){
            for( j=i+1;j<n;j++)
            if(a[i]==a[j]){
               m=a[i];
               System.out.println(m); 
            }
             
        }
    }
    }
