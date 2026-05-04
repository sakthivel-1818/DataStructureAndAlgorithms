package com.ArraysEasy;

public class MaximumConsecutiveOnes {
    public static void main(String[] args)
    {
        int[] nums={1,0,1,1,0,1};
        int count=0;
        int max=0;
        for(int i=0;i<nums.length;i++)
        {
            if (nums[i]==1)
            {
                count++;
                if(count>max)
                {
                    max=count;
                }
            }
            else if (nums[i]==0)
            {
                count=0;
            }
        }
        System.out.println(max);
    }
}
