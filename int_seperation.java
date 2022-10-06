import java.util.Scanner;

public class int_seperation {

    static void test(String str){
        String alp="";
        int num=0;
        String spc="";
        for(int i=0;i<str.length();i++){
             //System.out.println((int)str.charAt(i));
            if(str.charAt(i)>=65&&str.charAt(i)<=90||str.charAt(i)>=97&&str.charAt(i)<=122){
                alp=alp+str.charAt(i);
            }
            else if((int)str.charAt(i)>=49&&(int)str.charAt(i)<=57){
                int temp=(int)str.charAt(i)-48;
                num=(num*10)+temp;
            }
            else{
                spc=spc+str.charAt(i);
            }
        }
        System.out.println("Alphabets: "+alp);
        System.out.println("Numbers: "+num);
        System.out.println("Special characters : "+spc);
    }

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.print("Enter a string to Alphabets , special characters and numbers : ");
        String str=scn.nextLine();
        test(str);
        scn.close();
    }
}

