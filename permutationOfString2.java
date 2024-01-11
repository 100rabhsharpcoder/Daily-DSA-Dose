import java.util.Scanner;
import java.util.HashMap;

/**
 * permutationOfString2
 */
public class permutationOfString2 {  
    public static void generateWord(int cc, String str , Character[] spots, HashMap<Character, Integer> lastOccurences){
        if (cc  == str.length()) {
            for(int i =0; i < spots.length ; i++){
                System.out.print(spots[i]);
            }
            System.out.println();
            return;
        }
    char ch =  str.charAt(cc);
    int lo = lastOccurences.get(ch);
    for(int i = lo+1; i<spots.length; i++){
        if (spots[i] == null) {
            spots[i] = ch;
            lastOccurences.put(ch,i);
            generateWord(cc+1, str, spots, lastOccurences);
            lastOccurences.put(ch, lo);
            spots[i] =  null;
        }
    }
    }

    public static void main(String[] args) {
        Scanner scn  =  new Scanner(System.in);
        String str = scn.next();

        Character[] spots =  new Character[str.length()];
        HashMap<Character, Integer> lastOccurences =  new HashMap<>();
        for(char ch  : str.toCharArray()){
            lastOccurences.put(ch, -1);

        }

        generateWord(0, str, spots, lastOccurences);
    }
}