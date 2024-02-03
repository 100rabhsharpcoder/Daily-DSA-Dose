package array;

public class LeetCode2091MinimumMaximumArray {
    public static void main(String[] args) {
        
    }
    public int miniNumDeletion(int[] nums){
        int minIdx =0;
        int maxidx =0;
        int n = nums.length;
        for(int i=0; i<n; i++){
            if(nums[i] > nums[maxidx]){
                maxidx =i;
            }else if( nums[i]< nums[minIdx]){
                   minIdx = i;
            }
        }
        int x = Math.min(minIdx, maxidx);
        int y = Math.max(minIdx, maxidx);
         return Math.min(x+1+n -y, Math.min(y+1, n-x));
    }
}
