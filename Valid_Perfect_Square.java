import java.util.Scanner;
class Perfect_number{
    static void perfect(int a)
    {
        int k=0;
        for(int i=1;i<a;i++)
        {
            if(a==i*i)
            {
                k=1;
                break;
            }
        }
        if(k==1)
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
        int a;
        for(int i=0;i<n;i++)
        {
            a=s.nextInt();
            perfect(a);
        }
        
        
    }
}