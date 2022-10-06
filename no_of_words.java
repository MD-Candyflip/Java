public class no_of_words {

    static void test(String str){
        int count =1;
        int li=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==' '){
                count++;
                li=i;
            }
        }
        String last=str.substring(li+1);
        System.out.println(str);
        System.out.println("The number of words are : " + count);
        System.out.println("Last word : "+last+" \nlength of "+last+" : "+last.length());
        
    }
    public static void main(String[] args) {

        test("hello world good");
    }
}
