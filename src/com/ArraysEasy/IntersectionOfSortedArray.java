package com.ArraysEasy;

import java.util.ArrayList;

class Brut
{
    public static void brute(int[] a,int[] b)
    {
        int n1=a.length;
        int n2=b.length;
        int[] visited=new int[n2];
        ArrayList<Integer> temp=new ArrayList<>();
        for (int i = 0; i < n1; i++) {

            for (int j = 0; j < n2; j++) {
                if(a[i]==b[j] && visited[j]==0)
                {
                    temp.add(a[i]);
                    visited[j]=1;
                    break;
                }
                if (b[j]>a[i])
                {
                    break;
                }

            }


        }
        System.out.println(temp);
    }

}

class opti
{
    public static void optimal(int[]a,int[]b)
    {
        int i=0;int n1= a.length;
        int j=0;int n2=b.length;
        ArrayList<Integer> temp=new ArrayList<>();
        while(i<n1 && j<n2)
        {
            if (a[i]==b[j])
            {
                temp.add(a[i]);
                i++;
                j++;
            }
            else if(a[i]>b[j])
            {
                j++;
            }
            else if(a[i]<b[j])
            {
                i++;
            }
        }
        System.out.println(temp);
    }
}
public class IntersectionOfSortedArray {
    public static void main(String[] args) {
        int[] a = {1, 2, 2, 3, 3, 4, 5, 6};
        int[] b = {2, 3, 3, 5, 6, 6, 7};
        opti.optimal(a, b);
    }
}

//TC --- O(n1+n2)//
//Sc--o(1)