import java.util.Arrays;

public class SortingArray1{

    static char[] sort(char[] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    char temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        //System.out.println(Arrays.toString(arr));
        return arr;
    }
    public static void main(String[] args) {
        char[] arr={'z','s','d','w','e','f'};
        System.out.println(Arrays.toString(SortingArray1.sort(arr)));
    }
}