package cn.nancode.leecode;


import org.junit.Assert;
import org.junit.Test;

/**
 * https://leetcode-cn.com/explore/interview/card/top-interview-questions-easy/1/array/22/
 */
public class maxProfit {
    public int fun(int[] prices) {
        if (prices.length <= 1) {
            return 0;
        }

        int profit = 0;
        for (int i = 0; i < prices.length - 1; i++) {
            if (prices[i + 1] - prices[i] > 0) {
                profit += prices[i + 1] - prices[i];
            }
        }

        if (profit < 0) {
            return 0;
        }

        return profit;
    }

    @Test
    public void funTest() {
        int[] nums1 = {7, 1, 5, 3, 6, 4};   // 7
        int[] nums2 = {1, 2, 3, 4, 5};      // 4
        int[] nums3 = {7, 6, 4, 3, 1};      // 0


        Assert.assertEquals(7, fun(nums1));
        Assert.assertEquals(4, fun(nums2));
        Assert.assertEquals(0, fun(nums3));
    }
}
