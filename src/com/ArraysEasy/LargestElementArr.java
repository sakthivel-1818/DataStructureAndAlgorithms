package com.ArraysEasy;

public class LargestElementArr {
    public static void main(String[] args) {
        int[] arr={29,0,3,81,6,3};
        int largest=arr[0];
        for(int i =0 ;i<arr.length;i++)
        {
            if(largest<arr[i])
            {
                largest=arr[i];
            }
        }
        System.out.println(largest);
    }
}
