package com.ArraysEasy;

import java.util.ArrayList;
import java.util.TreeSet;
import java.util.List;
class Brute{
    public static void u_of_so_arr(int[] nums1,int[] nums2)
    {
        TreeSet<Integer> temp=new TreeSet<>(); // set is not allowing the null values

        for (int i = 0; i < nums1.length; i++) {  //  iterate the 1st array add in the set
            temp.add(nums1[i]);
        }
        for (int i = 0; i < nums2.length; i++) { // iterate the 1st array add in the set
        temp.add(nums2[i]);

        }
        for (int num:temp) // print the set
        {
            System.out.print(num+" ");
        }
    }
}

class Optimal
{
    public static void u_of_so_arr(int[] nums1,int[] nums2)
    {
        List<Integer> temp=new ArrayList<>();
        int i=0;
        int j=0;
        int n1= nums1.length;
        int n2=nums2.length;
        while(i<n1 && j<n2) // iterate both the ARRay
        {
            if(nums1[i]<nums2[j]) // check arr[i] is lessthan arr[j]
            {
                // temp.size()==0 because for the index arr[0]
                //it is sorted ARRAY so duplicate is compulsory next to the element
                //temp.get(temp.size()-1) to get the last add data because of duplicate check
                if (temp.size() == 0 || temp.get(temp.size() - 1) != nums1[i]) // contains keyword TC -- is o(n)
                {
                    temp.add(nums1[i]);

                }
                i++;
            }
            // temp.size()==0 because for the index arr[0]
                //it is sorted ARRAY so duplicate is compulsory next to the element
                //temp.get(temp.size()-1) to get the last add data because of duplicate check
            else if (nums2[j]<nums1[i]){
                if (temp.size() == 0 || temp.get(temp.size() - 1) != nums2[j])
                {
                    temp.add(nums2[j]);

                }
                j++;
            }
            // when b
//            else
//            {
//                if (temp.size() == 0 || nums1[i]== nums2[j])
//                {
//                    i++;
//                    j++;
//                }
//            }


        }
        // when arr1 exhausted this will check for the remaing element
        while(j<n2)
            {
                 if (temp.size() == 0 || temp.get(temp.size() - 1) != nums2[j])
                {
                    temp.add(nums2[j]);

                }
                 j++;
            }

        // when arr2 exhausted this will check for the remaing element
        while(i<n1)
            {
                 if (temp.size() == 0 || temp.get(temp.size() - 1) != nums1[i])
                {
                    temp.add(nums1[i]);

                }
                 i++;
            }
        System.out.println(temp);
    }
}
public class UnoinOfSortedArray {

    public static void main(String[] args)
    {
        int[] nums1={1,1,2,2,2,3,3,5,5,6,7};
        int[] nums2={2,2,5,5,9,9,8,8};
//        Brute brute=new Brute();
        Optimal brute=new Optimal();
        Optimal.u_of_so_arr(nums1,nums2);
    }
}
