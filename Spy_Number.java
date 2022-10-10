import java.util.Scanner;
class Spy_number{
    static int spy(int n){
        int t=0,pro=1,sum=0,k=0,r;
        t=n;
        while(t!=0)
        {
            r=t%10;
            sum+=r;
            pro*=r;
            t=t/10;
        }
        if(sum==pro)
        {
                k=1;
        }
        else
        {
            k=0;
        }
        return k;
    }
    
    public static void main(String args[]){
        int n;
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        int m=0;
        if(spy(n)==1)
        {
            System.out.println("Spy Number");
        }
        else
        {
             System.out.println("Not Spy Number");
        }
    }
}