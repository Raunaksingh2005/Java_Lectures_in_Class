package com.Raunak.day40;
import java.util.*;
public class Practice5 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        String name=sc.nextLine();
        int len=name.length();
        for(int i=0;i<len;i++){
            for(int j=i;j<len;j++){
                char ch=name.charAt(j);
                System.out.print(ch);
            }
            System.out.println();
        }
    }
}
