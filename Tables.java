import java.util.Scanner;
class Tables{
    public static void main(String args[]){
        int n,m;
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        m=s.nextInt();
        for(int i=1;i<=m;i++)
        { 
            if(i%2==1)
               System.out.println(String.format("%d x %d = %d",n,i,n*i));
        }
    }
}