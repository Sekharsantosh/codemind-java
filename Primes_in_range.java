 import java.util.Scanner;
 class Prime{
     static int prime(int n)
     {
         int k;
         k=1;
         if (n==1)
         {
             k=0;
         }
         else if(n>1)
         {
             for(int i=2;i<=Math.sqrt(n);i++)
             {
                 if(n%i==0)
                 {
                     k=0;
                 }
             }
         }
         return k;
     }
     public static void main(String args[]){
         int n,m;
         Scanner s=new Scanner(System.in);
         n=s.nextInt();
         m=s.nextInt();
         int c=0;
         for(int i=n;i<=m;i++)
         {
             if(prime(i)==1)
             {
                 c=c+1;
             }
         }
         System.out.println(c);
     }
 }