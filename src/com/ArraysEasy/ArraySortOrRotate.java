package com.ArraysEasy;

public class ArraySortOrRotate {
    public static boolean sortorrotate(int[] arr)
    {
        int n=arr.length;
        int count=0;
        for (int i = 0; i < n; i++)
        {
            if(arr[i]>arr[(i+1)%n])
            {
                count++;
            }

        }
        return count<=1;
    }
    public static void main(String[] args) {
//        int[] arr={1,2,3,4,5};
//        int[] arr={5,6,1,2,3,4};
        int[] arr={5,3,6,1,2,3,4};

        System.out.println(sortorrotate(arr));

    }
}
