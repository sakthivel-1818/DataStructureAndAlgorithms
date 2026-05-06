package com.ArrayMedium;

import java.util.HashMap;

public class TwoSum {
    public static void brute(int[] arr,int target)
    {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length ; j++) {
                if (arr[i]+arr[j]==target)
                {
                    System.out.println(i+","+j);
                    return;
                }
            }

        }
    }

    public static void better(int[] arr,int target)
    {
        HashMap<Integer,Integer> temp=new HashMap<>();
        for (int i = 0; i < arr.length; i++)
        {
            int num=target-arr[i];
            if (temp.containsKey(num))
            {
                System.out.println(temp.get(num)+" "+i);
                break;
            }
            else
            {
                temp.put(arr[i],i);
            }
        }
    }
    public static void main(String[] args)
    {
        int[] arr={2,6,5,8,11,22};
        int target=28;
        better(arr,target);
    }
}
