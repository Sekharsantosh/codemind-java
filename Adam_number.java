import java.util.Scanner;
class Adam_number{
    static int rev_sqr(int n){
        int k=0,r,t=0,j=0;
        t=n;
        while(t!=0)
        {
            r=t%10;
            k=k*10+r;
            t=t/10;
        }
        return k;
    }
    public static void main(String args[]){
        int n;
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        int l=0,t=0;
        t=n*n;
        l=rev_sqr(n);
        l=l*l;
        //System.out.format("%d %d",t,l);
        if(t==rev_sqr(l))
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
        
        
        
    }
}