package com.itkhamar;

import java.util.Arrays;

public class LargestNumber {
    public static void main(String[] args) {
        int[] nums = {1, 2, 8, 15, 10, 5, 3, 9, 0};
        int largest = findLargestNumber(nums);

        System.out.println(largest);
    }

    private static int findLargestNumber(int[] arr) {
        if (arr == null || arr.length == 0) {
            return 0;
        }

        if (arr.length == 1) {
            return arr[0];
        }

        return Arrays.stream(arr).max().getAsInt();
    }
}
