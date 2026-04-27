package com.ArraysEasy;

public class SecondLargestElementArr {
    public static void main(String[] args) {
        int[] arr={2,8,3,6,2,4,2};
        int firstlargest=arr[0];
        int secondlargest=-1;
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i]>firstlargest)
            {
                secondlargest=firstlargest;
                firstlargest=arr[i];
            }
            if (secondlargest<arr[i]&&firstlargest!=arr[i])
            {
                secondlargest=arr[i];
            }

        }
        System.out.println(secondlargest);
    }

}
