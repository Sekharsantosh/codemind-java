import java.util.Scanner;
public class file{
    public static void main(String[] args){
        int n,m;
        int s;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        m=sc.nextInt();
        s=n+m;
        if(n%2==0 &(n>0 | m%2==0))
        {
            
           System.out.println("YES");
        }
        else{
            
             System.out.println("NO");
          
        }
        
    }
}