import java.util.Arrays;

class Solution {
    
    static int freq(String str,char c){
        int count=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==c)count++;
        }
        return count;
    }
    
    static boolean isAnagram(String s, String t) {
        // if(s.length()!=t.length())return false;
        // String a="abcdefghijklmnopqrstuvwxyz";
        // for(int i=0;i<s.length();i++){
        //     for(int j=0;j<a.length();j++){
        //         if(freq(s,a.charAt(j))!=freq(t,a.charAt(j))){
        //             return false;
        //         }
        //     }
            
        // }
        // return true;
        char[] a=s.toCharArray();
        char[] b=t.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        for(int i=0;i<a.length;i++){
            if(a[i]!=b[i])return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isAnagram("anagram","margana"));
        //System.out.println(freq("anagram", 'n'));
    }
}
