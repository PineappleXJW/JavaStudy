package com.hunau.OOP.MethodTest.finalizeTest;

/**
 * @Systemname:Java学习练习
 * @Author:谢俊伟
 * @Description:
 * @Data:Created in 2021/4/29 20:28
 * @Unitname:湖南农业大学信科学院物联网工程系
 * @Copyright:谢俊伟 201841882121
 */

/**
 * 关于Object类中的finalize()方法：
 *  1、在Object类中的源代码：
 *      protected void finalize() throws Throwable{}
 *      GC：负责调用finalize()方法
 *  2、finalize()方法只有一个方法体，里面没有代码，而且这个方法是protected修饰的
 *  3、这个方法不需要程序员手动调用，JVM的垃圾回收器负责调用这个方法
 *  4、finalize()方法的执行时机：
 *      当一个Java对象即将被垃圾回收器回收的时候，垃圾回收器负责调用finalize()方法
 *  5、finalize()方法实际上是SUN公司为Java程序员准备的一个时机，垃圾销毁时机。
 *  如果希望在对象销毁时机执行一段代码的话，这段代码要写到finalize()方法中
 *  6、静态代码块的作用：
 *      static{
 *          ......
 *      }
 *      在类加载时刻执行，并且只执行一次
 *      这是一个SUN准备的类加载时机
 *
 *      而finalize()方法同样也是SUN为程序员准备的一个时机，是垃圾回收时机。
 *  7、Java中的垃圾回收器不是轻易启动的，垃圾太少、时间没到等种种条件下可能不会启动
 *
 *  8、####了解即可####
 */
public class Test01 {
    public static void main(String[] args) {

        //创建Person对象
        Person p = new Person();

        //把Person对象变成垃圾
        p = null;
////垃圾回收器启动也是有条件的，垃圾太少的时候不会启动，所以多造点
//        for(int i = 0;i < 1000000; i++){
//            Person p = new Person();
//            p = null;
//        }
//        //但是这种测试方法很笨重
        //有一段代码可以建议垃圾回收器启动
        System.gc();//建议启动垃圾回收器（只是启动的概率会高一些）

    }
}

/*
    若有需求：
        所有对象在JVM中被释放的时候，记录一下释放时间
        则这个功能写在finalize()中
 */
class Person{
    //重写finalize()方法
    //Person类型的对象被垃圾回收器回收的时候，垃圾回收器负责调用p.finalize();
    protected void finalize() throws Throwable{
        System.out.println(this + "即将被销毁");
    }
}
