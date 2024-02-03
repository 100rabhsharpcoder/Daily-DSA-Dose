package array;

public class SpecialSubsequenceScaler {
 public static void main(String[] args) {
    
 }  
 public int solve(String str){
    int n = str.length();
    int count =0;
    int ans = 0;
    for(int i=0; i<n; i++){
        if(str.charAt(i) == 'A'){
            count++;
        }else if (str.charAt(i) == 'G') {
            ans+=count;
        }
    }
    return ans;
 } 
}
