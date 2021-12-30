package com.hunau.Array.ArrayTest01;

/**
 *
 * 数组扩容：
 *      先新建一个大容量的数组，然后将小容量的数组中第元素一个一个地拷贝到大数组当中
 *      只能这样
 *
 * 数组拷贝：
 *      该方法已经由SUN写好了
 *          System.arraycopy
 *      源代码：
 *      public static native void arraycopy( Object src ,   --->源数组
 *                                           int srcPos ,   --->源数组中的起始位置
 *                                           Object dest ,  --->目的数组
 *                                           int destPos ,  --->目的数组中的起始位置
 *                                           int length )   --->拷贝的长度
 */
public class ArrayTest08 {
    public static void main(String[] args) {
        int[] src = {1,11,22,3,4};
    }
}