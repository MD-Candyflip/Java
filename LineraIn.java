public class LineraIn {

    
// Given two arrays of ints sorted in increasing order, outer and inner, 
// return true if all of the numbers in inner appear in outer. The best solution 
// makes only a single "linear" pass of both arrays, taking advantage of the fact 
// that both arrays are already in sorted order.


// linearIn([1, 2, 4, 6], [2, 4]) → true
// linearIn([1, 2, 4, 6], [2, 3, 4]) → false
// linearIn([1, 2, 4, 4, 6], [2, 4]) → true
    static boolean isLinear(int[] outer,int[] inner){
        boolean flag=false;
        for(int i=0;i<inner.length;i++){
            int temp=inner[i];
            for(int j=0;j<outer.length;j++){
                if(temp==outer[j])flag=true;
            }
            if(flag==false)return false;
        }
        return flag;
    }
    public static void main(String[] args) {
        int[] outer={1, 2, 4, 6};
        int[] inner={2,3,4};
        System.out.println(isLinear(outer,inner));
    }
}
