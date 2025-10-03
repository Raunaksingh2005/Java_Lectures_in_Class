package com.Raunak.FA;
import java.util.*;
public class fibo {
    static int fibonaci(int n){
        if(n==0) return 0;
        if(n==1) return 1;
        return fibonaci(n-1)+fibonaci(n-2);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            System.out.print(fibonaci(i)+" ");
        }
    }

}
