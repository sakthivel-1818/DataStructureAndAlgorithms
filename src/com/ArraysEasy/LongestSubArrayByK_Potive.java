package com.ArraysEasy;

import java.util.*;
public class LongestSubArrayByK_Potive {
    public static void brute1(int[] arr,int k)
    {
        int len=0;
        for (int i=0;i<arr.length;i++)
        {
            for(int j=i;j<arr.length;j++)
            {
                int sum=0;
                for (int l = i; l <=j ; l++)
                {
                    sum+=arr[l];
                }
                if (sum==k)
                {
                    len=Math.max(len,j-i+1);
                }
            }
        }
        System.out.println(len);
    }
    public static void brute2(int[]arr,int k)
    {
        int len=0;
        for(int i=0;i<arr.length;i++)
        {
            int sum=0;
            for (int j = i; j <arr.length ; j++)
            {
                sum+=arr[j];
                if(sum==k)
            {
                len=Math.max(len,j-i+1);
            }

            }

        }
        System.out.println(len);
    }
    public static void better(int[] arr,int k)
    {

        HashMap<Long, Integer> preSumMap = new HashMap<>();
        int maxlen=0;
        long sum=0;
        for(int i=0;i<arr.length;i++)
        {
            sum+=arr[i];
            if (sum==k)
            {
                maxlen=Math.max(maxlen,i+1);
            }

            long rem = sum-k;

            if (preSumMap.containsKey(rem))
            {
                int  len=i-preSumMap.get(rem);
                 maxlen=Math.max(len,maxlen);
            }
            if (!preSumMap.containsKey(sum))
            {
                preSumMap.put(sum,i);
            }
        }
        System.out.println(maxlen);
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,0,0,1,1,1,1,4,2,3};
        int k=4;
        better(arr,k);
    }
}
