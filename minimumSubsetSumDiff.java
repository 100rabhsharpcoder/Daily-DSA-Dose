import java.util.ArrayList;
import java.util.Scanner;

public class minimumSubsetSumDiff {
    static int minDiff = Integer.MAX_VALUE;
    static String result = "";

    public static void solve(int[] arr, int vidx, ArrayList<Integer> set1, ArrayList<Integer> set2, int sumSet1,
            int sumSet2) {
        if (vidx == arr.length) {
            int currentDiff = Math.abs(sumSet1 - sumSet2);
            if (currentDiff < minDiff) {
                minDiff = currentDiff;
                result = set1 + " " + set2;
            }
            return;
        }

        if (set1.size() < (arr.length + 1) / 2) {
            set1.add(arr[vidx]);
            solve(arr, vidx + 1, set1, set2, sumSet1 + arr[vidx], sumSet2);
            set1.remove(set1.size() - 1);
        }

        if (set2.size() < (arr.length + 1) / 2) {
            set2.add(arr[vidx]);
            solve(arr, vidx + 1, set1, set2, sumSet1, sumSet2 + arr[vidx]);
            set2.remove(set2.size() - 1);
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int[] arr = new int[scn.nextInt()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        solve(arr, 0, new ArrayList<>(), new ArrayList<>(), 0, 0);
        System.out.println(result);
    }
}
