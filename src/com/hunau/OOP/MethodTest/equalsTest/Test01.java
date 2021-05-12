package com.hunau.OOP.MethodTest.equalsTest;

/**
 * @Systemname:Java学习练习
 * @Author:谢俊伟
 * @Description:
 * @Data:Created in 2021/3/17 16:22
 * @Unitname:湖南农业大学信科学院物联网工程系
 * @Copyright:谢俊伟 201841882121
 */

/**
 * 关于Object类中的equals方法
 *  1、equals方法的源代码：
 *      public boolean equals(Object obj){
 *          return (this == obj);
 *      }
 *      以上是这个方法是Object类的默认实现
 *  2、SUN公司设计equals方法的目的：
 *      以后编程过程中，都要通过equals方法来判断两个对象是否相等。
 *      equals方法是判断两个对象是否相等的
 *
 *  3、需要研究一下Object类给的这个默认的equals方法够不够用
 *      在Object类中的equals方法当中，默认采用的是 “==” 判断两个Java对象是否
 *    相等。而“==”判断的是两个Java对象的内存地址，而我们应该判断的是两个Java对象
 *    的内容是否相等，所以默认的equals方法不够用，需要子类重写equals()。
 *
 *  4、判断两个Java对象是否相等，不能用 == ，因为 == 判断的是两个对象的内存地址
 *
 *  5、
 */
public class Test01 {
    public static void main(String[] args) {
        //判断两个基本数据类型的数据是否相等，直接使用"=="就行
        int a = 100;
        int b = 100;
        System.out.println(a == b);//true->相等
                                   //false->不相等

        //创建两个不同的对象，但属性都相同
        MyTime t1 = new MyTime(2008,8,8);
        MyTime t2 = new MyTime(2008,8,8);

        //测试以下：判断两个Java对象是否相等不能直接使用"=="
        System.out.println(t1 == t2); //false，因为这里的 == 判断的是：t1中保存的内存地址和t2中保存的内存地址是否相等
        //重写Object equals方法之前
//        boolean b1 = t1.equals(t2);
//        System.out.println(b1);     //false，因为这是重写之前的equals，本质上仍使用的 == 来判断，判断的是两个对象的内存地址

        //重写equals之后：
        boolean b2 = t1.equals(t2);
        System.out.println(b2);     //true

        MyTime t3 = new MyTime(2080,1,1);

        boolean b3 = t3.equals(t2);
        System.out.println(b3);

        //程序有无bug？   可以运行，但是效率低。    如何改造？
        MyTime t4 = null;
        System.out.println(t1.equals(t4));  //false ，不会出现空指针异常

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
    //默认的equal方法
//    public boolean equals(Object obj){
//        return (this == obj);
//    }

    //重写：
    //相同的返回值类型、方法名、形式参数列表【必须】
    public boolean equals(Object obj){
        if(obj == null || !(obj instanceof MyTime) || this == obj){    //如果obj为空
            return false;
        }
        MyTime t = (MyTime)obj;
        return this.year == t.year && this.month == t.month && this.day == t.day;

//
//        //获取第一个Time的年月日
//        int year1 = this.year;
//        int month1 = this.month;
//        int day1 = this.day;
//
//        //获取第二个Time的年月日
//        if(obj instanceof MyTime){  //判断方法参数列表中的obj是否为MyTime类的实例，instance返回true
//            MyTime t = (MyTime)obj;
//            int year2 = t.year;
//            int month2 = t.month;
//            int day2 = t.day;
//            if(year1 == year2 && month1 == month2 && day1 == day2) {
//                return true;
//            }
//        }
//        //如果能执行到此处，表示日期不相等
//        return false;


    }
}
