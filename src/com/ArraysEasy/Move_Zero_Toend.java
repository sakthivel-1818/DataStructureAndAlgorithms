package com.ArraysEasy;

import java.util.Arrays;

public class Move_Zero_Toend {
    public static void brute_move_0toend(int[]arr)
    {
        int n=arr.length;
        int[] temp=new int[n];

        int j=0;
        for (int i = 0; i < n; i++)
        {
            if (arr[i]!=0)
            {
                temp[j]=arr[i];
                j++;
            }

        }

        for (int i = 0; i < arr.length; i++)
        {
            arr[i]=temp[i];

        }
        System.out.println(Arrays.toString(arr));
    }
    public static void optimal_move_0toend(int[]arr)
    {
        int n=arr.length;
        int j=0;
        for (int i = 0; i < n; i++)// Find the first 0 and the index can store in j
        {
            if(arr[i]==0)
            {
                j=i;
                break;
            }

        }
        for(int i=j+1;i<n;i++)//loop start from  0 number next index if non zero number is exists swap
        {
            if(arr[i]!=0)
            {
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                j++;// i always get incremented j will incremented when swap is happen
            }
        }

    }
    public static void main(String[] args) {
        int [] arr= {1,0,2,0,3,1,0,7};
        optimal_move_0toend(arr);
        System.out.println(Arrays.toString(arr));
    }

}
