import java.util.Scanner;

class Anagram{

    static int findOccurrences(String str, char search){
        int count=0;
      for(int i = 0; i < str.length(); i++){
            char temp=str.charAt(i);
            if(temp==search) count++;
        }
        return count;
    }

    static boolean isAnagram(String a, String b) {
        a=a.toUpperCase();
        b=b.toUpperCase();
        // Complete the function
        if(a.length()!=b.length())return false;
        for(int i=0;i<a.length();i++){
            char temp=a.charAt(i);
            int k=findOccurrences(a, temp);
            //System.out.println(k);
            int v=findOccurrences(b, temp);
            //System.out.println(v);
            if(k!=v)return false;
          
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