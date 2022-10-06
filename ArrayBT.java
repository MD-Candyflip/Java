
public class ArrayBT {

    public static String getSmallestAndLargest(String str, int k) {
        String s="";
        String l="";
        int si=str.charAt(0);
        int li=str.charAt(0);
        // System.out.println(si);
        // System.out.println(li);
        for(int i=0;i<str.length();i++){
            //int temp1=str.charAt(i);
            si=Math.min(si,str.charAt(i));
            li=Math.max(li,str.charAt(i));
            
        }
        char a=(char)si;
        char b=(char)li;
        // System.out.println(si);
        // System.out.println(li);
        int s1=str.indexOf(a);
        int s2=str.indexOf(b);
        s=str.substring(s1,s1+k);
        l=str.substring(s2,s2+k);
        return s+"\n"+l;
        
    }
    public static void main(String[] args) {
        System.out.println(getSmallestAndLargest("welcometojava", 3));
    }
}
