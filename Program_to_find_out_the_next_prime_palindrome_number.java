 import java.util.Scanner;
 class prime_palindrome{
     static int prime(int n){
         int k=1;
         if(n==1)
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
     static int palindrome(int n){
         int t=0,r,rev=0,k=0;
         t=n;
         while(t!=0)
         {
             r=t%10;
             rev=rev*10+r;
             t=t/10;
         }
         if(n==rev)
         {
             k=1;
         }
         return k;
     }
     static void pripali(int n)
     {
         int t=0,r,l=0,s=0;
         t=n;
         while(t!=0)
         {
             t=t+1;
             if(prime(t)==1)
              {
                  if(palindrome(t)==1)
                  {
                      s=1;
                      l=t;
                      break;
                  }
              }
         }
         if(s==1)
         {
             System.out.println(l);
         }
     }
     public static void main(String args[]){
         int n;
         Scanner s=new Scanner(System.in);
         n=s.nextInt();
         pripali(n);
     }
 }