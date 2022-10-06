public class BigDiff {
    static int max(int a, int b) {
        if(a==b||a>b)return a;
        return b;
        
    }
    static int min(int a, int b) {
        if(a==b||a<b)return a;
        return b;
    }
    public static void main(String[] args) {
       int nums[]={7, 7, 6, 8, 5, 5, 6};
       int min=nums[0];
       int max=nums[0];
       for(int i=0;i<nums.length;i++){
        min=min(min,nums[i]);
        max=max(max,nums[i]);
       }
       System.out.println(max-min);
    }
}
