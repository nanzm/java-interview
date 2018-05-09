package cn.nancode.enumTest;

import org.junit.Test;

public class TestEnum {

    @Test
    public void test1() {
        System.out.println(Season.SPRING.getSeasonDesc());
        System.out.println(Season.SUMMER.getSeasonDesc());
        System.out.println(Season.AUTUMN.getSeasonDesc());
        System.out.println(Season.WINTER.getSeasonDesc());

    }
}

//枚举类
//class Season{
enum Season {
    SPRING("spring", "春暖花开"),
    SUMMER("summer", "夏日炎炎"),
    AUTUMN("autumn", "秋高气爽"),
    WINTER("winter", "酷冷寒冬");

    //1.提供类的属性 声明为private final
    private final String seasonName;
    private final String seasonDesc;

    //2.私有构造器
    private Season(String seasonName, String seasonDesc) {
        this.seasonName = seasonName;
        this.seasonDesc = seasonDesc;
    }

    //3.通过公共的方法来调用属性
    public String getSeasonName() {
        return seasonName;
    }

    public String getSeasonDesc() {
        return seasonDesc;
    }

    //4.创建枚举类的对象
//    public static final Season SPRING = new Season("spring", "春暖花开");
//    public static final Season SUMMER = new Season("summer", "夏日炎炎");
//    public static final Season AUTUMN = new Season("autumn", "秋高气爽");
//    public static final Season WINTER = new Season("winter", "酷冷寒冬");


    @Override
    public String toString() {
        return "Season{" +
                "seasonName='" + seasonName + '\'' +
                ", seasonDesc='" + seasonDesc + '\'' +
                '}';
    }
}
