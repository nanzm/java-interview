package cn.nancode.collection;

import org.junit.Test;

import java.util.*;

/**
 * Collection接口：
 * Set  元素无序，不可重复的集合
 * List  元素有序，可重复的集合
 * <p>
 * Map 接口 ：key-value对集合
 */
public class Collection1 {


    @Test
    public void TestCollection() {
        Collection coll = new ArrayList();
        System.out.println(coll.size());
        coll.add(12313);
        coll.add("AA");
        coll.add("BBB");
        coll.add(new Date().getTime());
        System.out.println(coll.size());
        System.out.println(coll);

        //addAll 添加一个集合
        Collection coll1 = Arrays.asList(1, 2, 3, 4, 5);
        coll.addAll(coll1);

        System.out.println(coll);
        System.out.println(coll.size());
        System.out.println(coll.hashCode());

        System.out.println("是否包含AA：" + coll.contains("AA"));
        System.out.println("是否为空：" + coll.isEmpty());
//        coll.clear();
//        System.out.println("清空后clear：" + coll.size());
        System.out.println("----------遍历-----------");
        Iterator iterator = coll.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

}
