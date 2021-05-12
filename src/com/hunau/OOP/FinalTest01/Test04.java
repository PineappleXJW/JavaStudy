package com.hunau.OOP.FinalTest01;

/**
 * @Systemname:Java学习练习
 * @Author:谢俊伟
 * @Description:
 * @Data:Created in 2021/1/22 16:39
 * @Unitname:湖南农业大学信科学院物联网工程系
 * @Copyright:谢俊伟 201841882121
 */
public class Test04 {
    public static void main(String[] args) {
        System.out.println(Chinese.GUO_JI);
        System.out.println("圆周率 = " + Math.PI);
    }
}

class Math{
    public static final double PI = 3.1415926535;
}

class Chinese{
    //需求：每个中国人对象的国籍不能再改变，为了防止国籍被修改，就建议加final修饰
    //final修饰的实例变量是不可变的，这里一般和static联合使用，被称为"常量"
    //public static final 类型 常量名 = 值;
    //Java编程规范：常量名全部大写，每个单词之间用下划线连接
    public static final String GUO_JI = "中国";
}
