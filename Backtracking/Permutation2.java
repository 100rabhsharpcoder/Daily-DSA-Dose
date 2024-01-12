package Backtracking;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Permutation2 {
    public static void permutation2(int cb , int tb , int[] items, int ssf, int ts , String asf){
        if(cb>tb){
            if (ssf == ts) {
                System.out.println(asf);
            }
            return;
            
        }
      for( int i=0; i<=ts; i++ ){
          if(items[i]==0){
            items[i] = 1;
            permutation2(cb+1, tb, items, ssf + 1, ts, asf+(i+1));
            items[i] = 0;
          }

      }
       permutation2(cb+1, tb, items, ssf + 1, ts, asf+(0));
    }
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int nboxes = Integer.parseInt(br.readLine());
        int ritems = Integer.parseInt(br.readLine());
        permutation2(1, nboxes,new int[ritems] , 0, ritems, "");

    }
}
