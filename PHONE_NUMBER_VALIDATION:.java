import java.util.Scanner;
class sum{
    public static void main(String args[]){
        String n;
        Scanner s=new Scanner(System.in);
        int k;
        n=s.nextLine();
        k=n.length();
        if(k==10)
        {
            System.out.println("Valid");
        }
        else
        {
             System.out.println("Invalid");
        }
    }
}