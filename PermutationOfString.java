import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;

/**
 * PermutationOfString
 */
public class PermutationOfString {
  public static void generateWord(int cs , int ts , HashMap<Character, Integer> fmap , String asf){
    if (cs>ts) {
        System.out.println(asf);
        return;
    }
     for(char ch : fmap.keySet()){
        if (fmap.get(ch)> 0) {
            fmap.put(ch,fmap.get(ch)-1);
            generateWord(cs+1, ts, fmap, asf+ch);
        }
     }
  }

    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        HashMap<Character, Integer> fmap = new HashMap<>();
        for(char ch :  str.toCharArray()){
            if (fmap.containsKey(ch)) {
                fmap.put(ch,fmap.get(ch)+1);
            }else{
                fmap.put(ch,1);
            }
        }
        generateWord(1, str.length(), fmap, "");

    }
}