package com.Algorithm;

import java.util.Arrays;

public class QuickSort {
    public static int quicksort(int[] arr,int low,int high)
    {
        int pivot=arr[low];
        int i=low;
        int j=high;
        while (i<j)
        {
            while (i<=high && arr[i]<=pivot)
            {
                i++;
            }
            while (j>=low && arr[j]>pivot)
            {
                j--;
            }
            if (i<j)
            {
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        int temp=arr[j];
        arr[j]=arr[low];
        arr[low]=temp;
        return j;


    }
    public static void partition(int[]arr,int low,int high)
    {
        if (low<high)
        {
            int partitionindex=quicksort(arr,low,high);
            partition(arr,low,partitionindex-1);
            partition(arr,partitionindex+1,high);
        }
    }
    public static void main(String[] args) {
        int[]arr={7,4,2,9,1,3,8};
        partition(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));

    }
}
