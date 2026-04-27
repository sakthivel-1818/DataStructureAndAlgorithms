package com.Algorithm;

import java.util.Arrays;

public class BubbleSort {
        public static void bubblealgo(int[]arr,int n)
        {
            for (int i = n-1; i>=1 ; i--)
            {
                for (int j = 0; j < i; j++)
                {
                    if (arr[j]>arr[j+1])
                    {
                        int temp=arr[j];
                        arr[j]=arr[j+1];
                        arr[j+1]=temp;
                    }
                    System.out.println(Arrays.toString(arr));
                }

            }
        }
        public static void main(String[] args)
        {
            int[] arr={5,7,1,0,4,8,6};
            bubblealgo(arr, arr.length);
        }
    }


