package com.ArraysEasy;

public class Left_Rotate_By_1 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        int temp=arr[0];//Store the 1st element

//        iterate the entire array and each value palced move by -1
        for(int i=1;i<arr.length;i++)
        {
            arr[i-1]=arr[i];
        }

//        After moving the entire arr place the first element in  the last
        arr[arr.length-1]=temp;

//        fetch
        for(int num:arr)
        {
            System.out.print(num + " ");
        }
    }
}
