package com.ArraysEasy;

import java.util.Arrays;

public class Right_Rotate_By_K_Times {
    public static void reverse(int[] arr,int left,int right)
    {
        int i = left;
        int j=right;
        while(i<j)
        {
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }

    public static void rotate_optimal(int[] arr,int k)
    {
        int n=arr.length;
        k=k%n;
        reverse(arr,n-k,n-1);
        reverse(arr,0,n-k-1);
        reverse(arr,0,n-1);

    }
    public static void main(String[] args)
    {
        int[]arr={1,2,3,4,5,6,7};
        rotate_optimal(arr,3);
        System.out.println(Arrays.toString(arr));

    }
}
