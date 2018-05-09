package cn.nancode.collection;

import org.junit.Test;

/**
 * 1.存储对象可以考虑 数组 集合
 * 2.数组存储对象的特点
 * 一旦创建  其长度不可变
 * 真实的数组存放的对象个数是不可知的
 */
public class Array {


    @Test
    public void Array() {
        Student[] stu = new Student[2];
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();

        stu[0] = s1;
        stu[1] = s1;

        System.out.println(stu.toString());
    }
}


