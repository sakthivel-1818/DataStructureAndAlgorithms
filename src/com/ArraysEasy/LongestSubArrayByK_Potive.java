package com.ArraysEasy;

import java.util.*;

import static java.lang.Math.*;

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
                    len= max(len,j-i+1);
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
                len= max(len,j-i+1);
            }

            }

        }
        System.out.println(len);
    }
    public static void optimal(int[] arr,int k)
    {
        int n=arr.length;
        int left=0;int right=0;
        int sum=arr[0];
        int len=0;
        while(right<n)
        {
            while (left<=right && sum>k)
            {
                sum-=arr[left];
                left++;
            }
            if (sum==k)
            {
                len=Math.max(len,right-left+1);
            }
            right++;
            if (right<n) {
                sum += arr[right];
            }
        }
        System.out.println(len);

    }
    public static void main(String[] args) {
        int[] arr={10, 5, 2, 7, 1};
        int k=15;
        optimal(arr,k);
    }
}


