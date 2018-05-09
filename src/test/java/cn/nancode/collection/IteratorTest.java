package cn.nancode.collection;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;

public class IteratorTest {

    @Test
    public void test1() {
        Collection coll = new ArrayList();
        coll.add(12313);
        coll.add("AA");
        coll.add("BBB");
        coll.add(new Date());
        coll.add(new Person("小王", 22));

        Iterator it = coll.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
