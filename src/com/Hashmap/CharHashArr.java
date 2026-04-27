package com.Hashmap;

import java.util.Scanner;

public class CharHashArr {
    public static void main(String[] args) {
        String a="ababcdmt";
        int[] hash=new int[27];
        for (int i = 0; i < a.length(); i++)
        {
            int ch= a.charAt(i);
            hash[ch-'a']+=1;
        }
        Scanner sc=new Scanner(System.in);
        int q= sc.nextInt();
        while (q-->0)
        {
            char ch=sc.next().charAt(0);
            System.out.println(ch +":"+hash[ch-'a']);
        }

    }
}
