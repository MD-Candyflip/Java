import java.util.Scanner;
public class uniqueno {

    static boolean check(int n){
        int count=0;
        int m=n;
        while(n>0){
            int r1=n%10;
            while(m>0){
                int r2=m%10;
                if(r1==r2){
                    count++;
                    if(count==2){
                        count=0;
                        return false;
                        
                    }
                }
                m=m/10;
            }
            n=n/10;
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println("Enter the numbert to check if the number is unique");
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
       if(check(n)==false)System.out.println("The number is not unique");
       else System.out.println("The  number is unique");
       scn.close();
    }
}
