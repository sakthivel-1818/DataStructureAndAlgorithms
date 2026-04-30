package com.ArraysEasy;

import java.util.HashSet;

//Remove Duplicates in sorted Arrays
public class RemoveDupInSortArr {
    public static void brute(int[] arr) {
        HashSet<Integer> seen = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            seen.add(arr[i]);
        }
        int count=0;
        for(int num:seen)
        {
            count++;
        }
        System.out.println(count);
    }

    public static void optimal(int[] arr)
    {
        int i=0;
        for (int j = 0; j < arr.length ; j++)
        {
            if (arr[i]!=arr[j])
            {
                arr[i+1]=arr[j];
                i++;
            }

        }
        System.out.println(i+1);
        for(int num:arr)
        {
            System.out.print(num + " ");
        }
    }
    public static void main(String[] args)
    {
        int[] arr={1,1,2,2,2,2,3,3,3,3,4,4,4,4};
        optimal(arr);
    }
}
