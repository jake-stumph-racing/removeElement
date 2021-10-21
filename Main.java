package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] nums = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        int val = 3;
//        System.out.println(Arrays.toString(removeElement(array, index)));
        int updatedArray = removeElement(nums, val);
        System.out.println(updatedArray);

    }

    public static int removeElement(int[] nums, int val) {
//        int[] newArray = nums;
//
//        for (int i = val; i < nums.length - 1; i++) {
//            nums[i] = nums[i + 1];
//        }
//        return newArray;

        int i = 0;
        int j = nums.length -1;

        while(i <= j){
            if(nums[i] == val){
                nums[i] = nums[j];
                j--;
            } else {
                i++;
            }
        }
        return j+1;
    }


}
