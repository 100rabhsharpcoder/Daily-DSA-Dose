package Backtracking;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class PermutationUsingBacktracking {

    public static void permutation(int[] boexs ,int ci, int ti){
       if (ci>ti) {
        for(int i=0; i<boexs.length; i++){
            System.out.println(boexs[i]);
        } 
        System.out.println();
        return;       
       }
        for(int i=0; i<boexs.length; i++){
            if (boexs[i] == 0) {
               boexs[i] = ci;
               permutation(boexs, ci+1, ti); 
               boexs[i] = 0;
            }
        }
    }
    public static void main(String[] args) {
        BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
        int nboxes = Integer.parseInt(br.readLine());
        int ritems = Integer.parseInt(br.readLine());
        permutation(new int[nboxes], 1, ritems);
    }
}
