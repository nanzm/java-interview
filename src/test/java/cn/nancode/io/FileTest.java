package cn.nancode.io;

import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.Iterator;

public class FileTest {

    @Test
    public void test1() throws IOException {
        File f = new File("/Users/sufun/Pictures");
        File[] files = f.listFiles();


        for (int j = 0; j < files.length; j++) {
            System.out.println(files[j]);
            System.out.println(files[j].getParent());
        }
    }
}
