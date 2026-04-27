package com.Algorithm;

import java.util.Arrays;

public class SelectionSort {
    public static void selectionalgo(int[]arr,int n)
    {
        for (int i = 0; i < n; i++)
        {
            int min=i;
            for (int j = i+1; j < n; j++)
            {
                if (arr[min]>arr[j])
                {
                    min=j;
                }
            }
            int temp=arr[min];
            arr[min]=arr[i];
            arr[i]=temp;
            System.out.println(Arrays.toString(arr));


        }

    }
    public static void main(String[] args) {
        int[] arr={9,8,5,1,7,2,3};
        selectionalgo(arr,arr.length);
        System.out.println(Arrays.toString(arr));
    }
}
