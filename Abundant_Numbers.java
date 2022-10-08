import java.util.Scanner;
class abundant{
    public static void main(String args[]){
        int n;
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        int k=0;
        for(int i=1;i<n;i++)
        {
            if(n%i==0)
            {
                k=k+i;
            }
        }
        if(k>n)
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
    }
}