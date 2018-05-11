package cn.nancode.array;

import org.junit.Assert;
import org.junit.Test;

public class ArrayTest {

    @Test
    public void addTest() {
        Array arr = new Array(10);
        arr.add(0, 23);
        arr.add(1, 123);
        arr.add(2, 34);
        arr.add(3, 55);
        arr.add(4, 65);
        System.out.println(arr);
    }
}
