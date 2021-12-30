package com.hunau.Array.ArrayTest01;

/**
 * @Systemname:Java学习练习
 * @Author:谢俊伟
 * @Description:
 * @Data:Created in 2021/5/12 15:33
 * @Unitname:湖南农业大学信科学院物联网工程系
 * @Copyright:谢俊伟 201841882121
 */

/**
 * 1、Java语言中的数组是一种引用数据类型，不属于基本数据类型。父类是Object
 * 2、数组是一个容器，是一个数据的集合
 * 3、可以存储基本数据类型的数据，一可以存储引用数据类型的数据
 * 4、数组存储在堆当中   /res/数组的内存结构
 * 5、对于数组当中如果存储的是Java对象的话，实际上存储的是对象的“引用（内存地址）”,不能直接存储Java对象
 * 6、数组一旦创建，在Java中规定，长度不可变
 * 7、数组的分类：一维数组、二维数组、三维......
 * 8、所有的数组对象都有length属性（Java自带），用来获取数组中元素的个数
 * 9、Java中的数组要求数组中元素的类型统一。
 * 10、数组中的元素内存地址是连续的
 * 11、数组实际上是一种简单的数据结构
 * 12、数组首元素的内存地址作为整个 数组的内存地址
 * 13、数组的优点和缺点：
 *      （1）优点：
 *          ①查询/查找/检索某个下标上的元素时效率极高，是查询效率最高的一个数据结构；
 *              原因：每个元素内存地址在空间存储上是连续的，每个元素类型相同，所以占用的空间大小一样，知
 *          道第一个元素内存地址，知道每一个元素占用空间的大小，又知道下标，可直接通过内存地址定位元素。
 *          ②无论数组存储多少个元素，在元素的检索/查询方面，效率是相同的；
 *              原因：因为数组中元素查找的时候不会一个一个找，是通过数学表达式计算出来的（算出一个内存
 *  *          地址后直接定位）。
 *
 *      （2）缺点
 *          ①由于为了保证数组中每个元素的内存地址连续，所以在数组上随机删除或插入元素的时候效率极低，因为
 *       随机增删元素会涉及到后面元素统一向前或后位移的操作；
 *          ②数组不能存储大数据量，因为很难在内存中找到大块连续的空间。
 *       对数组最后一个元素的 增删是没有效率影响的
 * 14、怎么声明或定义一个一维数组：
 *      int[] a;
 *      double[] a;
 *      boolean[] a;
 *      String[] a;
 *      Object[] a;
 * 15、怎么初始化一个一维数组：
 *      (1)静态初始化
 *          int[] array = {100,2100,300,55};
 *      (2)动态初始化
 *          int[] array = new int[5];//5表示数组的元素个数
 *                                  //初始化一个5个长度的int类型数组，每个元素默认值0
 *          String[] names = new String[6]; //初始化6个长度的String类型数组，每个元素默认值null
 */
public class ArrayTest01 {
    public static void main(String[] args) {
        int[] a1 = {1,100,10,20,55,689};

        System.out.println("数组中元素的个数为："+ a1.length);

        System.out.println("第一个元素是："+a1[0]);
        System.out.println("最后一个元素是：" + a1[5]);
        System.out.println("最后一个元素是：" + a1[a1.length-1]);

        //修改值
        a1[0] = 111;
        a1[a1.length-1] = 0;
        System.out.println("修改后：");
        System.out.println("第一个元素是："+a1[0]);
        System.out.println("最后一个元素是：" + a1[5]);
        System.out.println("最后一个元素是：" + a1[a1.length-1]);

        //遍历
        for (int i=0;i < 6;i++){
            System.out.println(a1[i]);
        }
        for (int j=a1.length-1;j>=0;j--){
            System.out.println(a1[j]);
        }

        //越界
        System.out.println(a1[6]);  //ArrayIndexOutOfBoundsException数组下标越界
    }
}
