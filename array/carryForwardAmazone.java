package array;

public class carryForwardAmazone {
    public static void main(String[] args) {
        
    }

    public int findPair(String str){
        int n= str.length();
        int ans = 0;
         int count  = 0;
         for(int i=0; i<n; i++){
            if(str.charAt(i) == 'a'){
                count++;
            }else if (str.charAt(i)=='g') {
                ans+=count;
            }
         }
         return count;

    }
}
