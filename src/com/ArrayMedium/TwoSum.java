package com.ArrayMedium;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static void brute(int[] arr,int target)
    {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length ; j++) {
                if (arr[i]+arr[j]==target)
                {
                    System.out.println(i+","+j);
                    return;
                }
            }

        }
    }

    public static void better(int[] arr,int target)
    {
        HashMap<Integer,Integer> temp=new HashMap<>();
        for (int i = 0; i < arr.length; i++)
        {
            int num=target-arr[i];
            if (temp.containsKey(num))
            {
                System.out.println(temp.get(num)+" "+i);
                break;
            }
            else
            {
                temp.put(arr[i],i);
            }
        }
    }
    public static int quicksort(int[] arr,int low,int high)
    {
        int pivot=arr[low];
        int i=low;
        int j=high;
        while (i<j)
        {
            while (low<high && arr[i]<=pivot)
            {
                i++;
            }
            while (high>low && arr[j]>pivot)
            {
                j--;
            }
            if (i<j)
            {
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }
        }
        int temp=arr[low];
        arr[low]=arr[j];
        arr[j]=temp;
        return j;

    }
    public static void partition(int[] arr,int low,int high)
    {
        if (low<high)
        {
            int partitionIndex=quicksort(arr, low, high);
            partition(arr,low,partitionIndex-1);
            partition(arr,partitionIndex+1,high);
        }
    }

    public static void main(String[] args)
    {
        int[] arr={2,11,22,5,6};
        int target=33;
        partition(arr,0,arr.length-1);
        int left=0;int right=arr.length-1;
        while (left<right)
        {
            int num=arr[left]+arr[right];
            if (num==target)
            {
                System.out.println(left+" "+right);
                break;
            }
            else if(num<target)
            {
                left++;

            } else if (num>target)
            {
                right--;
            }
        }
    }
}
