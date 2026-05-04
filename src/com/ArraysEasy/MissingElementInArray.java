package com.ArraysEasy;

import com.Hashmap.HashArr;

import java.util.*;

public class MissingElementInArray {
    public static void brute(int[] arr)
{
    for (int i =1;i<arr.length;i++)
    {
        int flag=0;
        for (int j = 0; j < arr.length; j++) {
            if(arr[j]==i)
            {
                flag=1;
                break;
            }
        }
        if(flag==0)
        {
            System.out.println(i);
        }
    }

}

public static void better(int[] arr)
{
    int[] hash=new int[arr.length+2];
    for(int i=0;i< arr.length;i++)
    {
        hash[arr[i]]=1;
    }
    for (int i = 1; i < hash.length; i++) {

        if (hash[i]==0)
        {
            System.out.println(i);
            break;
        }

    }

}
public static void optimal(int[] arr)
{
    int n=arr.length+1;
    int sum=n*(n+1)/2;
    int sum2=0;
    for (int i = 0; i < n-1; i++) {
        sum2+=arr[i];

    }
    System.out.println(sum-sum2);
}

public static void optimal2(int[] arr)
{
    int xor1=0;
    int xor2=0;
    for (int i = 0; i < arr.length-1; i++) {
        xor2=xor2^arr[i];
//        System.out.print(xor2);
        xor1=xor1^i+1;
        System.out.print(xor1);
    }
    xor1=xor1^arr.length;
    System.out.println(xor1);
    System.out.println(xor2);
    System.out.println(xor1^xor2);
}
    public static void main(String[] args) {

        int[] arr={1,2,3,4,6};
        optimal2(arr);

    }
}
