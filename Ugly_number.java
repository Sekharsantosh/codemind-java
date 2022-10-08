import java.util.Scanner;
class Ugly{
    static int ugly(int n){
        int k=0;
        if(n==1)
        {
            k=1;
        }
        else if (n%2==0)
        {
            return ugly(n/2);
        }
        else if(n%3==0)
        {
            return ugly(n/3);
        }
        else if(n%5==0)
        {
            return ugly(n/5);
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
        if(ugly(n)==1)
        {
            System.out.println("Ugly Number");
        }
        else
        {
            System.out.println("Not Ugly Number");
        }
    }
}