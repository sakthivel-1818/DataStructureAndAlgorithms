package com.ArrayMedium;

import java.util.Arrays;

public class Sort_0s_1s_2s {

//     brute{
//         using sorting algorithm
//     }

    public static void better(int[] arr)
    {
        int count0=0;
        int count1=0;
        int count2=0;

        for(int i =0;i<arr.length;i++)
        {
            if(arr[i]==0)
            {
                count0++;
            }
            else if (arr[i]==1)
            {
                count1++;
            }
            else
            {
                count2++;
            }
        }

        for (int i = 0; i < count0; i++)
        {
            arr[i]=0;
        }
        for (int i = count0; i <count1+count0; i++)
        {
            arr[i]=1;
        }
        for (int i = count1+count0; i < arr.length; i++)
        {
            arr[i]=2;
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(count0);
        System.out.println(count1);
        System.out.println(count2);
    }

    public static void optimal(int[] arr)
    {
        int low=0;
        int mid=0;
        int high=arr.length-1;
        while(mid<=high)
        {
            if (arr[mid]==0)
            {
                int temp=arr[mid];
                arr[mid]=arr[low];
                arr[low]=temp;
                low++;
                mid++;
            }
            else if (arr[mid]==1)
            {
                mid++;
            }
            else if (arr[mid]==2)
            {
                int temp=arr[mid];
                arr[mid]=arr[high];
                arr[high]=temp;
                high--;


            }

        }
        System.out.println(Arrays.toString(arr));

    }
    public static void main(String[] args) {
        int[] arr={0,1,2,0,1,2};
        optimal(arr);

        String a="3";
        String b="3";
        int res= (int)Math.pow(3,3) ;
        System.out.println(res);
    }
}
