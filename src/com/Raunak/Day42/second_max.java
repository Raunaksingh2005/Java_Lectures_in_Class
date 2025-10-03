package com.Raunak.Day42;
import java.util.*;
public class second_max {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int max =Integer.MIN_VALUE;
        int smax =Integer.MIN_VALUE;
        for (int i = 0; i < n; i++){
            if(arr[i]>max){
                smax=max;
                max=arr[i];
            }
            if(arr[i]!=max && smax<arr[i]){
                smax=arr[i];
            }
        }
        System.out.println(smax);
    }
}