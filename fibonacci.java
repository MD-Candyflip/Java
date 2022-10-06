import java.util.*;
class fibonacci{
    public static void main(String[] args) {
        System.out.println("Enter the number of fibonacci numbers");
        Scanner scn=new Scanner(System.in);
        int no=scn.nextInt();
        long first=0,second=1,next=0;
        int i=0;
        while(i<no){
        //for(int i=0;i<no;i++){
            if(i<=1){
                next=i;
            }
            else {next=first+second;
            first=second;
            second=next;
            }
            System.out.print(" "+next);
            scn.close();
            i++;
        }
        
    }
}