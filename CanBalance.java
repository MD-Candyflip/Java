public class CanBalance {

    static boolean isBalance(int[] arr,int x){
        int rsum=0;
        int lsum=0;
        for(int i=x;i<arr.length;i++){
            rsum+=arr[i];
        }
        for(int i=x-1;i>=0;i--){
            lsum+=arr[i];
        }
        if(lsum==rsum)return true;
        return false;

    }

    static boolean check(int[] arr){
        for(int i=0;i<arr.length;i++){
            if(isBalance(arr,i)){
                return true;
            }

        }
        return false;
    }
    public static void main(String[] args) {
        int [] arr={2, 1, 1, 2, 1};
        System.out.println(check(arr));
    }
}
