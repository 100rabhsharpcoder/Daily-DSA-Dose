package Backtracking;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Combination2 {
    public static void combination2(boolean[] boxes, int ci, int ti, int Ib){
        if (ci>ti) {
            for(int i=0; i<boxes.length; i++){
              if (boxes[i]) {
                System.out.print("i");
              }else{
                System.out.print("-");
              }
              System.out.println();
            }
            return;
        }
        for(int b = Ib+1; b< boxes.length; b++){
        if (boxes[b] == false) {
            boxes[b] =  true;
            combination2(boxes,ci+1,ti , b);
            boxes[b] = false;
        }
        }
    }
 public static void main(String[] args) {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int nboxes = Integer.parseInt(br.readLine());
        int ritems = Integer.parseInt(br.readLine());
        combination2(new int[nboxes],1, ritems, -1);
 }   
}
