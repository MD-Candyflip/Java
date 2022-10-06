import java.util.Arrays;
import java.util.Scanner;

public class Anagram2 {

    static boolean isAnagram(String str1,String str2){
        if(str1.length()!=str2.length()) return false;
        char[] c1=str1.toUpperCase().toCharArray();
        char[] c2=str2.toUpperCase().toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        for(int i=0;i<c1.length;i++){
            if(c1[i]!=c2[i]) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println("Enter two strings to check if it is an anagram : ");
        Scanner scn=new Scanner(System.in);
        String a=scn.next();
        String b=scn.next();
        if(isAnagram(a, b)==true){
            System.out.println("The string "+a+" and "+b+" are anagrams");
        }
        else {
            System.out.println("The strings "+a+" and "+b+" are not angrams");
        }
        scn.close();
    }
}
