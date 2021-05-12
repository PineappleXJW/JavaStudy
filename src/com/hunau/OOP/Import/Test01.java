package com.hunau.OOP.Import;

/**
 * @Systemname:Java学习练习
 * @Author:谢俊伟
 * @Description:
 * @Data:Created in 2021/3/15 20:59
 * @Unitname:湖南农业大学信科学院物联网工程系
 * @Copyright:谢俊伟 201841882121
 */

import java.util.Scanner;

/**
 * import什么时候使用？
 *  A类中使用B类；
 *  A类和B类都在 同一个包下，不需要import
 *  A类和B类不在同一个包下，需要用import
 *
 * import怎么用？
 *  import语句只能出现在package语句之下，class声明语句之上
 *  import语句还可以采用*的方式，表示全部导入
 */
public class Test01 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.next();
        System.out.println(str);
        /*
            lang包下的直接子类，比如String、System...
         */
        java.lang.String name = "ZhangSan";
        System.out.println(name);
    }

}
