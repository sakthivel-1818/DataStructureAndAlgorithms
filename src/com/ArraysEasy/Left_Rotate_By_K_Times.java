package com.ArraysEasy;

import java.util.Arrays;

public class Left_Rotate_By_K_Times {

//    Brute Solution
    public static void rotate_brute(int[]arr,int k)
    {

        int n= arr.length;
        k=k%n;
        int[] temp=new int[3];
        for (int i = 0; i < temp.length; i++)
        {
            temp[i]=arr[i];
        }

        for (int i = k; i < arr.length ; i++)
        {
            arr[i-k]=arr[i];
        }

        for (int i = n-k; i < arr.length ; i++)
        {
            arr[i]=temp[i-(n-k)];

        }

    }

    public static void reverse(int[]arr,int left,int right )
    {
        int i=left;
        int j=right;
        while (i<j)
        {
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        return;
    }
    public static void rotate_optimal(int[] arr,int k)
    {
        int n =arr.length;
        k=k%n;
        reverse(arr,0,k-1);//  reversing the array from (0 to k-1)
        reverse(arr,k,n-1); // reversing the array from (k to n-1)
        reverse(arr,0,n-1);// reversing the entire array
        System.out.println(Arrays.toString(arr));

    }
    public static void main(String[] args) {
        int[]arr={1,2,3,4,5,6,7};
//        rotate_brute(arr,8);
        rotate_optimal(arr,3);

    }
}
