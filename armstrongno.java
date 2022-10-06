import java.util.*;
public class armstrongno {
    public static void main(String[] args) {
        System.out.println("Enter a number to find out if its an armstrong number");
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        scn.close();
        int s=0;
        int a=n;
        while(n>0){
            int r;
            r=n%10;
            s=s+(int) Math. pow(r,3);
            n=n/10;
        }
            if(s==a){
                System.out.println("This is an armstrong number");
                
        }
            else{
                System.out.println("This is not an armstrong number");
                

        }

    }
    
}

    

