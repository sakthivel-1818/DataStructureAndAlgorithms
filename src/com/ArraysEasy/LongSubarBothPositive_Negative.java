package com.ArraysEasy;

import java.util.HashMap;

import static java.lang.Math.max;

public class LongSubarBothPositive_Negative {
    public static void better(int[] arr, int k) {

        HashMap<Long, Integer> preSumMap = new HashMap<>();
        int maxlen = 0;
        long sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (sum == k) {
                maxlen = max(maxlen, i + 1);
            }

            long rem = sum - k;

            if (preSumMap.containsKey(rem)) {
                int len = i - preSumMap.get(rem);
                maxlen = max(len, maxlen);
            }
            if (!preSumMap.containsKey(sum)) {
                preSumMap.put(sum, i);
            }
        }
        System.out.println(maxlen);
        System.out.println(preSumMap);
    }

    public static void main(String[] args) {
        int[] arr={10, 5, 2, 7, 1, -10};
    }

}
