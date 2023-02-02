import java.util.Scanner;
import java.util.Arrays;
public class file{
    public static void main(String[] args){
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(int i=0;i<n;i++){
            int x1,x2,y1,y2;
            x1=sc.nextInt();
            x2=sc.nextInt();
            y1=sc.nextInt();
            y2=sc.nextInt();
          /*  System.out.print(x1);
             System.out.print(x2);
              System.out.print(y1);
               System.out.print(y2);*/
            if((double)y1/x1<(double)y2/x2){
                System.out.println("-1");
            }
            else if((double)y1/x1==(double)y2/x2){
                
                  System.out.println("0");
            }
            else{
                  System.out.println("1");
            }
        }
        
        
    }
}