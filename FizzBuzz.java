import java.util.*;
public class FizzBuzz {

    static String[] Fizzbuzz(int start, int end) {
        String[] a=new String[end-1];
        int j=0;
        for(int i=start;i<=a.length;i++){
            if(i%3==0&&i%5==0){
                a[j]="FizzBuzz";
            }
            else if(i%3==0){
                a[j]="Fizz";
            }
            else if(i%5==0){
                a[j]="Buzz";
            }
            else {
                a[j]=i+"";
            }
            j++;
        }
        return a;
    }
    public static void main(String[] args) {

        String s=Arrays.toString(Fizzbuzz(1,11));
        System.out.println(s);
    }
}
