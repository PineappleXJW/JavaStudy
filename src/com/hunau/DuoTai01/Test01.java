package com.hunau.DuoTai01;

/**
 * @Systemname:Java学习练习
 * @Author:谢俊伟
 * @Description:
 * @Data:Created in 2021/1/21 12:38
 * @Unitname:湖南农业大学信科学院物联网工程系
 * @Copyright:谢俊伟 201841882121
 */

/**
 * 1、关于Java语言中的多态语法机制：【基本语法】
 *      1、Animal、Cat、Bird三个类之间的关系：
 *          Cat继承Animal
 *          Bird继承Animal
 *          Cat与Bird无任何关系
 *
 * 2、面向对象三大特征：封装、继承、多态
 *
 * 3、关于多态中涉及的几个概念：
 *      *向上转型(upcasting)子类型--->父类型【自动】
 *      *向下转型(downcasting)父类型--->子类型【强制】 要加强制类型转换符
 *
 *      *无论是向上转型还是向下转型，两者之间必须有继承关系
 */
public class Test01 {

    public static void main(String[] args) {

        //以前编写的程序：
        Animal a1 = new Animal();
        a1.move();

        Cat c1 = new Cat();
        c1.move();
        c1.catchMouse();

        Bird b1 = new Bird();
        b1.move();


        //使用多态语法机制
        /**
         * 1、Animal和Cat之间存在继承关系，Animal是父类，Cat是子类
         * 2、Cat is an Animal
         * 3、new Cat()创建的对象的类型是Cat，a2这个引用的数据类型是Animal，可见他们进行了类型转换
         * 子类型转换成父类型，成为向上转型/upcasting，或者称为自动类型转换。
         * 4、Java中允许这种语法：父类型引用指向子类型对象
         */
        Animal a2 = new Cat();
        /**
         *1、程序永远都分为编译阶段和运行阶段
         * 2、线分析编译阶段，再分析运行阶段，若编译无法通过，则不能运行
         * 3、编译阶段编译器检查a2这个引用的数据类型为Animal，由于Animal.class
         * 字节码当中有move()方法，所以编译通过了。这个过程我们称为静态绑定，编译阶段绑定。
         * 只有当静态绑定成功之后才有后续运行。
         * 4、在程序运行阶段，JVM堆内存当中真是创建的对象是Cat对象，那么以下程序在运行阶段
         * 一定会调用Cat()对象的move()方法，此时发生了程序的动态绑定，运行阶段绑定
         * 5、无论Cat()类有没有重写move方法，运行阶段一定调用的是Cat对象的move方法，因为底层
         * 真实对象就是Cat对象
         * 6、父类型引用指向子类型对象这种机制导致程序存在编译阶段的绑定和运行阶段的绑定两种不同的
         * 形态/状态，这种机制可以成为一种多态语法机制
         */
        a2.move();

        /**
         * 分析以下程序为什么不能调用：
         *      因为编译阶段编译阶段编译器检查到a2的类型是Animal类型，
         *      从Animal.class字节码文件当中查找catchMouse()方法，
         *      最终没有找到该方法，导致静态绑定失败，没有绑定成功，也
         *      就是说编译失败，更不能运行 
         */
        //a2.catchMouse();

        /**
         * 该怎样调用a2的catchMouse？
         *      a2是无法直接调用的，因为a2的类型Animal，Animal中没有catchMouse()方法
         *      可以将a2强制类型转换为Cat类型
         *      a2的类型是Animal(父类)，转型为Cat类型(子类)，被称为向下转型/downcasting/强制类型转换
         *
         *  注：向下转型也需要两者之间必须有继承关系，不然编译报错，无法运行。需要加强制类型转换符
         *
         *  什么时候需要向下转型？
         *      当调用的方法/访问的属性是子类型中特有的，在父类型中不存在，必须向下转型。
         *
         */

        Cat c2 = (Cat)a2;
        /*
            long x = 100L;
            int i = (int)x;
         */
        c2.catchMouse();

        Animal a3 = new Bird();

        /**
         * 以下程序编译是没有问题的，因为编译器检查到a3的数据类型是Animal
         * Animal和Cat之间存在继承关系，并且Animal是父类型，Cat是子类型
         * 父类型转换成子类型叫做向下转型，语法合格
         *
         * 虽然编译通过，但是程序在运行阶段会出现异常，因为JVM堆内存当中真实
         * 存在的对象是Bird类型，Bird对象无法转换成Cat对象，因为两种类型之
         * 间不存在继承关系，此时出现了一个很重要的异常：
         *      java.lang.ClassCastException
         *      类型转换异常，这种异常总是在“向下转型”时会发生
         */
        //Cat c3 = (Cat)a3;//Exception in thread "main" java.lang.ClassCastException:

        /**
         * 以上异常只有在强制类型转换的时候会发生，也就是说“向下转型”存在隐患（编译通过，但是运行出错！）
         * 向上转型之要编译通过，运行一定不会出问题：Animal a = new Cat();
         * 向下转型编译通过，运行可能出错：Animal a3 = new Bird(); Cat c3 = (Cat)a3;
         * 怎么避免向下转型出现的ClassCastException？
         *      使用instanceof运算符可以避免出现以上异常
         *
         * instanceof：
         *      语法格式：
         *          (引用 instanceof 数据类型名)
         *      执行结果：
         *          (布尔类型)
         *          true/false
         *              true表示：a这个引用指向的对象是一个Animal类型
         *              false表示：a这个引用指向的对象不是Animal类型
         *
         * Java规范中要求：在进行强制类型转换之前，建议采用instanceof运算符进行判断，避免ClassCastException异常的发生
         */
        if (a3 instanceof Cat){
            Cat c3 = (Cat)a3;
            //调用了子类中特有的方法
            c3.catchMouse();
        }else if (a3 instanceof Bird){
            Bird b2 = (Bird)a3;
            //调用了子类中特有的方法
            b2.fly();
        }

    }

}












