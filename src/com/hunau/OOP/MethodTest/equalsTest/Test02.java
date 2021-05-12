package com.hunau.OOP.MethodTest.equalsTest;

/**
 * @Systemname:Java学习练习
 * @Author:谢俊伟
 * @Description:
 * @Data:Created in 2021/4/15 16:23
 * @Unitname:湖南农业大学信科学院物联网工程系
 * @Copyright:谢俊伟 201841882121
 */
/*
Java语言下的String类有没有重写toString和equals？
    1、String类已经重写了equals方法，比较两个字符串不能用==，必须使用equals，equals是通用的；
    2、String类已经重写了toString方法。
 */
/*
    Java中什么类型的数据可以使用“==”判断？
        基本数据类型
    Java中什么类型的数据需要使用equals判断？
        引用数据类型 * all
*/

public class Test02 {
    public static void main(String[] args) {
        //大部分情况下，采用这样的方式创建字符串对象
        String s1 = "hello";
        String s2 = "hello";
        System.out.println(s1 == s2);

        //实际上String也是一个类，不属于基本数据类型
        //既然String是一个类，那么一定存在构造方法
        String s3 = new String("Test1");
        String s4 = new String("Test1");
        System.out.println(s3 == s4); //false

        //比较两个字符串不能用 ==，必须调用equals方法。而String类已经重写了equals方法了
        System.out.println(s1.equals(s2));
        System.out.println(s3.equals(s4));  //true，表明String类已经重写了equals方法

        System.out.println(s1.equals(s4));

        //String类有没有重写toString方法？
        String x = "你好！";
        //如果没有重写toString方法，输出的应该是：java.lang.String@+十六进制地址
        System.out.println(x.toString());   //输出：谢俊伟
        System.out.println(x);  //谢俊伟
        System.out.println(s1.toString());
        System.out.println(s3.toString());
        //所以String类已经重写了toString方法

    }
}
