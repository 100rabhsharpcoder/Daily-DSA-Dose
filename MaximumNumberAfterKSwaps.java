import java.util.Scanner;

/**
 * MaximumNumberAfterKSwaps
 */
public class MaximumNumberAfterKSwaps {


    public static void findMaximun(String str, int k){
        if (Integer.parseInt(str) > Integer.parseInt(max)) {
            max = str;
        }
        if (k==0) {
            return;
        }
        for(int i = 0; i<str.length()-1; i++){
            for(int j=0; i<str.length(); j++){
                if(str.charAt(j) > str.charAt(i)){
                   str =  swap(str, i, j);
                    findMaximun(str, k-1);
                 str =  swap(str, i, j);

                }
            }
        }
    }


    static String max ;
    public static void main(String[] args) {
        Scanner scn  = new Scanner(System.in);
        String str = scn.next();
        int k =  scn.nextInt();
        max = str;
        
        findMaximun(str, k);
        System.out.println(max);
    }
    public static String swap(String str,int i, int j){
         char ith  = str.charAt(i);
         char jth  = str.charAt(j);

         String left = str.substring(0, i);
         String middle =  str.substring(i+1, j);
         String right =  str.substring(j+1);
      return left+ jth+ middle+ith+right;
    }
}