import java.util.Scanner;
class Perfect_number{
    static void perfect(int a)
    {
        int k=0;
        for(int i=1;i<a;i++)
        {
            if(a%i==0)
            {
                k=k+i;
            }
        }
        if(k==a)
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
        
    }
    public static void main(String args[]){
        int n;
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        perfect(n);
        
        
    }
}