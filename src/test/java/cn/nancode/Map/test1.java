package cn.nancode.Map;

import org.junit.Test;

public class test1 {

    @Test
    public void code1() {
        int i = 0;
        while (i < 100000000) {
            double m = Math.random();
            System.out.println(m);
            if (m == 0) break;
            i++;
        }
    }
}
