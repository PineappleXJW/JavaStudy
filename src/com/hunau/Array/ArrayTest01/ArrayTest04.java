package com.hunau.Array.ArrayTest01;
//当一个方法的参数是一个数组时，还可以用如下方法传参
public class ArrayTest04 {
    public static void main(String[] args) {
        int[] a = {1,2,3};
        printArray(a);
        System.out.println("*******************");
        int[] a2 = new int[4];
        printArray(a2);
        System.out.println("*******************");
        printArray(new int[3]);
        System.out.println("*******************");
//        printArray({1,2,3});  //没有这种语法
        //如果直接传递一个静态数组的话，必须这样写：
        printArray(new int[]{1,2,3});
    }

    public static void printArray(int[] array){
        for(int i = 0 ;i<array.length;i++){
            System.out.println(array[i]);
        }
    }
}
