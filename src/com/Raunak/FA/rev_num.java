package com.Raunak.FA;
import java.util.*;
public class rev_num {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int rev=0;
        int orignal=n;
        while(n!=0){
            int digit=n%10;
            rev=rev*10+digit;
            n/=10;
        }
        if(orignal==rev){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not pal");
        }
    }
}
