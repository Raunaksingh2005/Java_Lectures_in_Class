package com.Raunak.FA;
import java.util.*;
public class Prime {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ispal=0;
        for(int i=2;i<n;i++){
            if(n%i==0){
                ispal=1;
                break;
            }
        }
        if(ispal==0){
            System.out.println("Prime");
        }else{
            System.out.println("Not prime");
        }
    }
}
