package array;

import java.util.Scanner;

public class prefixSum {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int size = scn.nextInt();
        int[] arr =  new int[size];
         for(int i=0 ; i< size; i++){
            arr[i] = scn.nextInt();
         }

         int[] pf = new int[size];
          pf[0] = arr[0];
         for(int i = 1; i<size; i++){
              pf[i] = pf[i-1]+ arr[i];
         }
         for(int i =0; i<pf.length; i++){
            System.out.println(pf[i]);
         }
    }
}
