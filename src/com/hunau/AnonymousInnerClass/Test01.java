package com.hunau.AnonymousInnerClass;

/**
 * @Systemname:Java学习练习
 * @Author:谢俊伟
 * @Description:
 * @Data:Created in 2021/5/12 13:17
 * @Unitname:湖南农业大学信科学院物联网工程系
 * @Copyright:谢俊伟 201841882121
 */

/**
 * 内部类：
 *     1、什么是内部类？
 *         内部类：在类的内部又定义了一个新的类，被称为内部类
 *     2、内部类的分类：
 *         静态内部类：类似于静态变量
 *         实力内部类：类似于实例变量
 *         局部内部类：类似于局部变量
 *     3、使用内部类编写的代码可读性很差，能不用就不用
 *
 *
 */
public class Test01 {
    //该类在类的内部，所以称为内部类
    //静态内部类
    static class Inner1{

    }
    //该类在类的内部，所以称为内部类
    //实例内部类
    public class Inner2{

    }
    public void doSome(){
        //局部变量
        int i = 100;
        //该类在类的内部，所以称为内部类
        //局部内部类
        class Inner3{

        }
    }
    public void doOther(){
        //必须把外面的new出来再new内部类
        new Test01().new Inner2();
        //但在实际开发中已经很少用了，有更好的设计开发模式了
    }
}

