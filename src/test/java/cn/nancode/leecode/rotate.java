package cn.nancode.leecode;

import org.junit.Assert;
import org.junit.Test;

public class rotate {
    public void fun(int[] nums, int k) {

    }

    @Test
    public void funTest() {
        // [1,2,3,4,5,6,7] 和 k = 3
        // [5,6,7,1,2,3,4]
        System.out.println(fib(2));
    }

    public int fib(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        return fib(n - 1) + fib(n - 2);
    }

}
