package com.hunau.MethodTest.toStringTest;
/**
 * @Systemname:Java学习练习
 * @Author:谢俊伟
 * @Description:
 * @Data:Created in 2021/3/16 17:57
 * @Unitname:湖南农业大学信科学院物联网工程系
 * @Copyright:谢俊伟 201841882121
 */
/**
 * 关于Object类中的toString()方法
 *  1、源代码长什么样？
 *      public String toString(){
 *          return this.getClass().getName() + "@" + Integer.toHexString(hashCode());
 *      }
 *      源代码上的toString()方法的默认实现是：
 *          类名@对象的内存地址转换为十六进制的形式
 *
 *  2、toString()方法的作用是什么？
 *      toString方法设计的目的是：通过调用这个方法可以将一个“java对象”转换成“字符串表示形式”
 *
 *  3、SUN公司开发Java语言的时候，建议所有的子类都去重写toString方法。
 *      toString方法应该是一个简洁的、详实的、易阅读的
 *
 */
public class Test {
    public static void main(String[] args) {
        MyTime t1 = new MyTime(2001,04,19);
        String s1 = t1.toString();
        MyTime t2 = new MyTime(2001,12,24);
        //MyTime类重写toString()方法之前
        System.out.println(s1);//MyTime@十六进制
        //一个日期对象转换成字符串形式的话，还是希望看到具体的日期信息

        //若不调用toString方法，println也会自动调用
        System.out.println(t2);
    }
}
class MyTime{
    int year;
    int month;
    int day;

    public MyTime(){
    }

    public MyTime(int year,int month,int day){
        this.year = year;
        this.month = month;
        this.day = day;
    }
    //重写toString()方法
    //这个toString()方法越简洁越好，可读性越强越好
    //向简介的、详实的、易阅读的方向发展
    public String toString(){
        return this.year + "年" +this.month + "月" + this.day + "日";
    }


}
