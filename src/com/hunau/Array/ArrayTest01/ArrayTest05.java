package com.hunau.Array.ArrayTest01;

/**
 * main方法上的String[] args 有什么用
 *  分析一下，谁负责调用main方法————JVM
 *  JVM调用main方法的时候，会自动传一个String数组过来
 *  这个args数组主要是用来接收用户输入参数的，用户可以在控制台上输入参数，这个参数会被自动转换为"String[] args"x
 */
public class ArrayTest05 {
    //这个方法程序员负责写出来，JVM负责调用，JVM调用的时候一定会传一个String数组过来
    public static void main(String[] args) {
        //JVM默认传递过来的这个数组对象的长度是0
        //通过测试
        System.out.println("JVM给传递过来的String数组参数，它这个数组的长度是" + args.length);
        //args不是null，只是长度是0
        printLength(args);

        //以下代码表示：数组对象创建了，但是里面没有数据
        String[] strings1 = new String[0];
        String[] strings2 = {};
        printLength(strings1);
        printLength(strings2);

        for(int i = 0 ;i < args.length;i++){
            System.out.println(args[i]);
        }
    }

    public static void printLength(String[] args){
        System.out.println(args.length);
    }
}
