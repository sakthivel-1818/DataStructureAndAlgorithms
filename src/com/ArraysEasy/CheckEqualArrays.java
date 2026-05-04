package com.ArraysEasy;

import java.util.HashMap;

public class CheckEqualArrays {
    public static void main(String[] args) {
        int a[] = {1,1,1,1};
        int b[]={1,1,1,1};
        HashMap<Integer,Integer> temp=new HashMap<>();
         for (int i = 0; i < a.length; i++)
        {
            if (temp.containsKey(a[i]))
            {
                temp.put(a[i],temp.get(a[i])+1);
            }
            else
            {
                temp.put(a[i],1);
            }

        }
          for (int i = 0; i < b.length; i++)
        {
            if (temp.containsKey(b[i]))
            {
                temp.put(b[i],temp.get(b[i])-1);
            }


        }
        for (int key: temp.keySet())
        {
            if (temp.get(key)!=0)
            {
                System.out.println(false);
            }
        }
        System.out.println(true);
    }
}
