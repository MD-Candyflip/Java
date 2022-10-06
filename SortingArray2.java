import java.util.Arrays;

public class SortingArray2 {

    static int[] sort(int[] arr){

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-1;j++){
                if(arr[j] < arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }

            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr={5,1,3,2,4};
        System.out.println(Arrays.toString(sort(arr)));
    }
}
