package com.ArraysEasy;

import java.util.Arrays;

public class SingleNumber {

    public static void brute(int[] arr)
    {
        for(int i=0;i< arr.length;i++)
        {
            int num=arr[i];
            int count=0;
            for(int j=0;j< arr.length;j++)
            {
                if(num==arr[j])
                {
                    count++;
                }
            }
            if(count==1)
            {
                System.out.println(num);
            }
        }

    }

    public static void better(int[] arr)
    {
        int max=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>max) {
                max = arr[i];
            }
        }
        int[] hash=new int[max+1];
        for (int i = 0; i < arr.length; i++)
        {
            hash[arr[i]]+=1;
        }
        for(int i=0;i< hash.length;i++)
        {
            if(hash[i]==1)
            {
                System.out.println(i);
                break;
            }
        }
    }

    public static void opti(int[] arr)
    {
        int xor=0;
        for (int i =0;i<arr.length;i++)
        {
            xor=xor^arr[i];
        }
        System.out.println(xor);
    }

    public static void main(String[] args) {
        int[] arr={4,1,2,1,2};

        opti(arr);

    }
}
