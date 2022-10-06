import java.util.*;
public class CheckDigits {

    static int check(int n,int z){
        int count=0;
        int r;
        for(int i=1;i<=z;i++){
            int m=i;
            while(m>0){
                r=m%10;
                if(r==n)count++;
                m=m/10;
                }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.print("Enter the number u wanna check for repetation : ");
        int n=scn.nextInt();
        System.out.print("Enter the upper limit for which u wanna check for repetation : ");
        int z=scn.nextInt();
        int a=check(n, z);
        System.out.println("The number of times "+n+" is repeated from 0-"+z+" is "+a);
        scn.close();
    }
}
