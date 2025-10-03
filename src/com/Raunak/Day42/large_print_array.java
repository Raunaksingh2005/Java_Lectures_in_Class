package com.Raunak.Day42;
import java.util.*;
public class large_print_array {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] [] m=new int[3][3];
        for (int i =0;i<3;i++) {
            for (int j=0;j<3;j++) {
                m[i][j] = sc.nextInt();
            }
        }
        for(int i =0;i<3;i++){
            int large=m[i][0];
            for(int j=0;j<3;j++){
                if(m[i][j]>large){
                    large=m[i][j];
                }
            }
            System.out.println("Largest in row "+(i+1)+" "+large);
        }
    }
}
