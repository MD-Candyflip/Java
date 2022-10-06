public class GreatestCharRepetation {

    public static int occourances(String str,char key){
        int count=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==key){
                count++;
            }
        }
        return count;
    }

    public static String test(String str){
        String words[]=str.split(" ");
        int count = 0;
        int tempcount=0;
        int index=0;
        for(int i=0; i<words.length; i++){
            for(int j=0; j<words[i].length(); j++){
                tempcount=occourances(words[i],words[i].charAt(j));
                if(tempcount>count){
                    index=i;
                }
                count=Math.max(count, tempcount);
            }
        }
        if(count==1)return "-1";
        return words[index];
    }
    public static void main(String[] args) {
        System.out.println(test("Hello world java"));  //Expected output : Hello
        System.out.println(test("No words")); //Expected output : -1
    }
}
