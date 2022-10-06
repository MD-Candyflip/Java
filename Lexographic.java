public class Lexographic {
    public static String getSmallestAndLargest(String str, int k) {

        int l=str.length();
        int min=str.charAt(0);
        int max=str.charAt(0);
        for(int i=0; i<l-k+1; i++) {
            int temp=str.charAt(i);
            max=Math.max(max,temp);
            min=Math.min(min,temp);
        }
        char a=(char)min;
        char b=(char)max;
        int x=str.indexOf(a);
        int y=str.indexOf(b);
        String minstr=str.substring(x,x+k);
        String maxstr=str.substring(y,y+k);

        // System.out.println(minstr);
        // System.out.println(maxstr);

        return minstr+"\n"+maxstr;
        
    }

    public static void main(String[] args) {
        System.out.println(getSmallestAndLargest("ASDFHDSFHsdlfhsdlfLDFHSDLFHsdlfhsdlhkfsdlfLHDFLSDKFHsdfhsdlkfhsdlfhsLFDLSFHSDLFHsdkfhsdkfhsdkfhsdfhsdfjeaDFHSDLFHDFlajfsdlfhsdlfhDSLFHSDLFHdlfhs", 30));
        
    }
}
