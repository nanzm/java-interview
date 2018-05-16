package cn.nancode.array;

import org.junit.Test;

import java.util.ArrayList;

public class ArrayTest {

    @Test
    public void addTest() {
        Array arr = new Array(10);
        arr.add(0, 34);
        arr.add(1, 34);
        arr.add(2, 55);
        arr.add(3, 65);
        System.out.println(arr);

    }
}
