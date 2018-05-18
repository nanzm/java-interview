package cn.nancode.leecode;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

/**
 * https://leetcode-cn.com/explore/interview/card/top-interview-questions-easy/1/array/21/
 */
public class removeDuplicates {
    public int fun(int[] A) {
        if (A.length < 2)
            return A.length;

        //利用 两个游标
        int j = 0;
        int i = 1;

        while (i < A.length) {
            if (A[i] == A[j]) {
                i++;
            } else {
                j++;
                A[j] = A[i];
                i++;
            }
        }

        return j + 1;
    }

    @Test
    public void funTest() {
        int[] nums1 = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int[] nums2 = {1, 1, 2};

        Assert.assertEquals(5, fun(nums1));
        Assert.assertEquals(2, fun(nums2));

        System.out.println(Arrays.toString(nums1));
        System.out.println(Arrays.toString(nums2));
    }
}
