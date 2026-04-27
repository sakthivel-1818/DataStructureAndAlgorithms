package com.Algorithm;

import java.util.ArrayList;
import java.util.Arrays;

public class MergeSort {
    public static void merge(int[]arr,int low,int mid,int high)
    {
        int left=low;
        int right=mid+1;
        ArrayList<Integer> temp=new ArrayList<>();
        while (left<=mid && right<=high)
        {
            if (arr[left]<arr[right])
            {
                temp.add(arr[left]);
                left++;
            }
            else
            {
                temp.add(arr[right++]);
            }
        }
        while(left<=mid)
        {
            temp.add(arr[left]);
            left++;
        }
        while(right<=high)
        {
            temp.add(arr[right]);
            right++;
        }

        for (int i = low; i <=high; i++)
        {
            arr[i]=temp.get(i-low);
        }
    }
    public static void split(int[] arr,int low,int high)
    {
        if(low>=high)
        {
            return;
        }
        int mid=(low+high)/2;
        split(arr, low, mid);
        split(arr, mid+1, high);
        merge(arr,low,mid,high);
    }
    public static void main(String[] args)
    {
        int[] arr={4,5,7,9,1,6,0,3};
        split(arr,0, arr.length-1);
        System.out.println(Arrays.toString(arr));


    }
}
