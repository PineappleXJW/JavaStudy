package com.hunau.OOP.FinalTest01;

/**
 * @Systemname:Java学习练习
 * @Author:谢俊伟
 * @Description:
 * @Data:Created in 2021/1/21 22:29
 * @Unitname:湖南农业大学信科学院物联网工程系
 * @Copyright:谢俊伟 201841882121
 */

/**
 * 关于Java语言中的final关键字：
 *      1、final关键字，表示最终的，不可变的
 *      2、final修饰的类无法被继承
 *      3、final修饰的方法无法被覆盖
 *      4、final修饰的变量一旦赋值之后，不可重复赋值
 *      5、final的实例变量，必须手动赋值
 *      6、final修饰的引用,一旦指向某个对象，不能再只想其他对象，那么
 *      被指向的对象也无法被垃圾回收器回收。
 *      7、final修饰的引用，所指向的对象内部的内存是可以修改的。
 *
 * 对于以后要学的类库，一般包括三个要素：
 *      - 源码
 *      - 字节码
 *      - 帮助文档
 */
public class Test01 {
    public static void main(String[] args) {
        int i = 10;
        System.out.println(i);
        i = 20;
        System.out.println(i);

        final int j = 10;
        System.out.println(j);
        //j = 20;
        //System.out.println(j);
    }
}
