package com.Raunak.day40;

public class Practice6 {
    public static void  main(String[] args){
        for(int i=0;i<5;i++){
            int n=1;
            for(int j=0;j<5-i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++){
                System.out.print(n+" ");
                n=n*(i-j)/(j+1);
            }
            System.out.println();
        }
    }
}
