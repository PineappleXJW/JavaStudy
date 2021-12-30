package com.hunau.Array.ArrayTest01;

/**
 * 什么时候采用静态初始化，什么时候采用动态初始化
 *      当创建数组时，确定了数组中存储哪些具体元素时，直接用静态初始化方式   Object[] objects = {xxx,xxx,xxx};
 *      当创建数组时，不确定要存储哪些具体元素，则用动态初始化方式   Object[] objects = new Object[10];
 */

public class ArrayTest02 {
    public static void main(String[] args) {
        //采用动态初始化的方式定义一个数组
        int[] a = new int[4];   //创建长度为4的int型数组，数组中每个元素的默认值是0
        //遍历数组
        for(int i = 0;i<a.length;i++){
            System.out.println("数组下标为" + i + "的元素是" + a[i]);
        }

        //采用动态初始化的方式定义一个Object类型的数组
        Object[] objs = new Object[3];  //默认为null
        for(int i = 0 ;i<objs.length; i++){
            System.out.println(objs[i]);
        }   //输出结果为 null null null

        String[] strs = new String[4];
        for(int i = 0 ;i<strs.length; i++){
            System.out.println(strs[i]);
        }   //输出结果为 null null null

        String[] strs2 = {"123","456","789"};
        for(int i = 0 ;i<strs2.length; i++){
            System.out.println(strs2[i]);
        }   //输出结果为 123 456 789

        Object o1 = new Object();
        Object o2 = new Object();
        Object o3 = new Object();

        Object[] objects = {o1,o2,o3};
        //Object[] objects = {new }

        for(int i = 0 ;i<objects.length; i++){
            System.out.println(objects[i]);
        }   //会输出三个Object对象o1 o2 o3 的地址
    }
}
