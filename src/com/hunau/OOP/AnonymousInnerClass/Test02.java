package com.hunau.OOP.AnonymousInnerClass;

/**
 * @Systemname:Java学习练习
 * @Author:谢俊伟
 * @Description:
 * @Data:Created in 2021/5/12 14:49
 * @Unitname:湖南农业大学信科学院物联网工程系
 * @Copyright:谢俊伟 201841882121
 */

/**
 * 匿名内部类：
 *     1、匿名内部类是局部内部类的一种，因为这个类没有名字所以叫做匿名内部类
 *
 *     2、匿名内部类的两个缺点：
 *      ①太复杂，可读性差（在实际项目中应该已经体会到）
 *      ②不可重复使用
 *
 */
public class Test02 {
    public static void main(String[] args) {
        //调用MyMath中的mySum方法
        MyMath mm = new MyMath();

//        //这样写表示的是用最普通的方法来实现接口，实现接口后的类叫做ComputeImpl
//        Compute c = new ComputeImpl();
//        mm.mySum(c,100,200);

        //使用匿名内部类，表示这个ComputeImpl这个类没名字了！
        //这里表面看上去是接口可以直接new了，实际上并不是接口可以new了，而是后面的{}代表了对接口的实现
        mm.mySum(new Compute() {
            @Override
            public int sum(int a, int b) {
                return a+b;
            }
        },100,200);
        //不建议使用匿名内部类，因为一个类没有名字，没有办法重复使用，且可读性太差，只是看起来很高端，以后看别人的代码要看得懂
    }
}
//负责计算的接口
interface Compute{

    //抽象方法
    int sum(int a,int b);
}
////Compute接口的实现类
//class ComputeImpl implements Compute{
//
//    @Override
//    public int sum(int a, int b) {
//        return a+b;
//    }
//}

//数学类
class MyMath{
    //数学求和方法
    public void mySum(Compute c,int x,int y){
        int value = c.sum(x,y);
        System.out.println("x" + "+" + "y" + "=" + value);
    }
}
