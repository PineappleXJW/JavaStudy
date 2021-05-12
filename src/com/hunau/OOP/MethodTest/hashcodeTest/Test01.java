package com.hunau.OOP.MethodTest.hashcodeTest;

/**
 * @Systemname:Java学习练习
 * @Author:谢俊伟
 * @Description:
 * @Data:Created in 2021/5/12 13:05
 * @Unitname:湖南农业大学信科学院物联网工程系
 * @Copyright:谢俊伟 201841882121
 */

/**
 * hashcode()方法：
 *  在Object中的hashcode
 *      public native int hashcode();
 *
 *      这个方法不是抽象方法，带有native关键字，调用底层C++程序。
 *
 *  hashcode()方法返回的值是哈希码：
 *      实际上就是一个Java对象的内存地址，经过哈希算法，得出的一个值。
 *      所以hashcode()方法的执行结果可以等同看作一个Java对象的内存地址。
 */
public class Test01 {
    public static void main(String[] args) {
        Object o = new Object();

        int hashCodeValue = o.hashCode();

        //对象内存地址经过一个哈希算法转换的一个数字。可以等同看作内存地址
        System.out.println(hashCodeValue);
        System.out.println(o.toString());

        MyClass myClass = new MyClass();
        int hashCodeValue2 = myClass.hashCode();
        System.out.println(hashCodeValue2);
        System.out.println(myClass.toString());
    }

}

class MyClass{

}
