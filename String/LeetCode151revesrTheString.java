package String;

/**
 * LeetCode151revesrTheString
 */
public class LeetCode151revesrTheString {

    public static void main(String[] args) {
        
    }

    public String reverseWords(String s) {
        String result  = ""; String word = "";
        int start = s.length()-1;
        int end  = s.length()-1;
        int j;

        for(int i=s.length()-1; i>=0; i--){
           if(s.charAt(i) == ' '){
            start = i+1;
            word = "";
            for(j=start; j<=end; j++){
              word = word + s.charAt(j);
            }
            if (!word.isEmpty())
            result =  result + word + " ";
            end  = i-1;
           }
        }
        word = "";
        for(j=0; j<=end; j++){
          word = word + s.charAt(j);
        }
        if (!word.isEmpty())
        result =  result + word + " ";
        return result.trim();

    }
}