import java.util.Scanner;
class roy_picture{
    public static void main(String args[]){
        int l;
        Scanner s=new Scanner(System.in);
        l=s.nextInt();
        int n;
        n=s.nextInt();
        int w,h;
        for(int i=0;i<n;i++)
        {
            w=s.nextInt();
            h=s.nextInt();
            if((w==h)&&(w>=l && h>=l))
            {
                //System.out.format("%d %d ",w,h);
                System.out.println("ACCEPTED");
            }
            else if((w>=l)&&(h>=l))
            {
                // System.out.format("%d %d ",w,h);
                System.out.println("CROP IT");   
            }
            else 
            {
               // System.out.format("%d %d ",w,h);
                System.out.println("UPLOAD ANOTHER");
            }
            
        }
    }
}