 import java.util.Scanner;
 class simple_interest{
     public static void main(String args[]){
         int p,t,r;
         Scanner s=new Scanner(System.in);
         p=s.nextInt();
         t=s.nextInt();
         r=s.nextInt();
         int si=0;
         si=(p*t*r)/100;
         System.out.println(si);
     }
 }