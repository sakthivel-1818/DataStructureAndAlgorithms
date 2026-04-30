package com.ArraysEasy;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr={1,4,5,2,7};
        int num=10;
        int index=-1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==num)
            {
                index=i;
            }

        }
        System.out.println(index);
    }
}
