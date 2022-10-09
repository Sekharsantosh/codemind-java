 import java.util.Scanner;
 class natural{
     public static void main(String args[]){
         int n;
         Scanner s=new Scanner(System.in);
         n=s.nextInt();
         int k;
         k=0;
         while(n!=0)
         {
             k=k+n;
             n-=1;
         }
         System.out.println(k);
     }
 }