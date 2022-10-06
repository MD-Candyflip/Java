import java.util.Scanner;

public class CountHash {

    static int check(String str){
        int count = 0;
        String[] res=str.split(" ");
        for(int i=0; i<res.length; i++) {
            if(res[i].length()>2&&res[i].startsWith("#")&&res[i].endsWith("#")) count++;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        //String a="#abc# #hi# #hello xyz# ## #a#";
        System.out.println("Enter a string: ");
        String s=scn.nextLine();
        int x=check(s);
        System.out.println("The number of words in : "+s+" starting and ending with '#' is "+x);
        scn.close();
    }
}
