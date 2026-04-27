package com.Algorithm;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr={4,7,2,8,3,1};
        int n= arr.length;
        for(int i=0;i<n;i++)
        {
            int j=i;
            while (j>0 && arr[j] <arr[j-1])
            {
                int temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
                j--;

            }
            System.out.println(Arrays.toString(arr));
        }
    }
}
