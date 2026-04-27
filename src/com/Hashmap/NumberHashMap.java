package com.Hashmap;

import java.util.*;

public class NumberHashMap {
    public static void main(String[] args){
    int[] arr={25,3,3,1,71,25,3,1,2,2,8,33};
    HashMap<Integer,Integer> hash=new HashMap<>();
        for(int i = 0; i < arr.length ; i++)
        {
        if(hash.containsKey(arr[i]))
        {
            hash.put(arr[i], hash.get(arr[i])+1);
        }
        else
        {
            hash.put(arr[i],1);
        }
    }
        Scanner sc=new Scanner(System.in);
        int q= sc.nextInt();
        while (q-->0)
        {
            int num= sc.nextInt();
            if(hash.containsKey(num)) {
                System.out.println(num + ":" + hash.get(num));
            }
            else
            {
                System.out.println(num +":"+hash.getOrDefault(num,0));
            }
        }

//        iterating a map by using a for each method
        for (int key:hash.keySet())
    {
        System.out.println(key +"--"+ hash.get(key));
    }

}
}
