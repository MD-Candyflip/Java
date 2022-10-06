public class MaxSpan {

    static int check(int[] arr,int key){
        int start=0;
        int end=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                start=i;
                break;
            }
        }
        for(int i=0;i<arr.length;i++) {
            if(arr[i]==key){
                end=i;
            }
        }
        return end-start+1;
    }
    public static void main(String[] args) {
        int[] arr={1,4,2,1,4,1,4};
        System.out.println(check(arr,4));
    }
    
}
