package com.Raunak.Day44;
import java.util.*;
class Factorial {
    static int factorial(int n){
        if(n==0||n==1){
            return 1;
        }
        return n*factorial(n-1);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num= sc.nextInt();
        int a=factorial(num);
        System.out.print(a);
    }
}