import java.util.Scanner;
class Amicable{
    public static void main(String args[]){
        int n,m,t=0,k=0;
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        m=s.nextInt();
        for(int i=1;i<n;i++)
        {
            if(n%i==0)
            {
                t+=i;
            }
        }
        for(int i=1;i<m;i++)
        {
            if(m%i==0)
            {
                k+=i;
            }
        }
        if(t==m)
        {
            if(k==n)
               System.out.println("Amicable");
        }
        else
        {
            System.out.println("Not Amicable");
        }
        
    }
}