import java.util.Arrays;

public class SplitString {
    public static void main(String[] args) {
        String input="hello world good morning";
        String[] arr=input.split(" ");
        System.out.println(input);
        System.out.println(Arrays.toString(arr));
        System.out.println("The number of words are : "+arr.length);
        //String last=arr[arr.length-1];
        //System.out.println("The length of "+arr[arr.length-1]+" is : "+arr.lengthword"" is : "+arr[arr.length-1].length());

    }
}
