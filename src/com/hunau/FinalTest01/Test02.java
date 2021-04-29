package com.hunau.FinalTest01;

/**
 * @Systemname:Java学习练习
 * @Author:谢俊伟
 * @Description:
 * @Data:Created in 2021/1/22 16:16
 * @Unitname:湖南农业大学信科学院物联网工程系
 * @Copyright:谢俊伟 201841882121
 */
public class Test02 {

    //final int age;
    //上述程序会报错
    //实例变量有默认值 && final修饰的变量不能重复赋值

    //综合考虑：final修饰的实例变量必须手动赋值
    //第一种解决方案
    final int age = 10;

    //第二种解决方案
    final int num;
    public Test02() {
        this.num = 200;
    }

    //以上的两种方案其实相当于一种：在构造方法中给final修饰的变量赋值
 static void main(String[] args) {
        final int a;
        a = 10;

    }
}
