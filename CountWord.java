//import java.util.Arrays;

public class CountWord {

    static int count(String str,String word){
        int count=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==' '){
                count++;
            }
        }
        String[] words = new String[count+1];
            int start=0;
            int end=0;
            int index=0;
            for(int i=0;i<str.length();i++){
                if(str.charAt(i)==' '){
                    end=i;
                    words[index]=str.substring(start,end);
                    
                    index++;
                    start=end+1;
                    //System.out.println(i);
                }
            }
            //System.out.println(start);
            //System.out.println(index);
            words[index]=str.substring(start);
            //System.out.println(Arrays.toString(words));
            count=0;
            for(int i=0;i<words.length;i++){
                if(words[i].equals(word)){
                    count++;                
                }
            }
            return count;
        }
        
    public static void main(String[] args) {
        System.out.println(count("abc asd abc asd abc qwe wer ash abc 123 abc @#$%","abc"));
    }
}
