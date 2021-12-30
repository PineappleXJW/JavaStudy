package com.hunau.Array.ArrayTest01;
//当一个方法上的参数是一个数组时该怎么传参
public class ArrayTest03 {
    public static void main(String args[]) {
        //调用方法时传一个数组
        int[] x = {1,2,3,4};
        printArray(x);
        String[] y = {"asd","sdf","fgh"};
        printArray(y);
        String[] strArray = new String[3];
        printArray(strArray);

        printArray(new String[3]);
        printArray(new int[4]);
    }

    //定义一个方法
    public static void printArray(int[] array){
        for(int i = 0; i<array.length;i++){
            System.out.println(array[i]);
        }
    }

    public static void printArray(String[] array){
        for(int i = 0; i<array.length;i++){
            System.out.println(array[i]);
        }
    }
}
