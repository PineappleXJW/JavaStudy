package com.hunau.OOP.DuoTai02;

/**
 * @Systemname:Java学习练习
 * @Author:谢俊伟
 * @Description:
 * @Data:Created in 2021/1/21 22:03
 * @Unitname:湖南农业大学信科学院物联网工程系
 * @Copyright:谢俊伟 201841882121
 */

/**
 * 多态在实际开发中的作用，以主人养宠物为例：
 *      主人【类】
 *      主人可以喂养宠物
 *      宠物【类】
 *      宠物可以吃东西
 *
 * 多态的作用是什么：
 */
public class Test01 {
    public static void main(String[] args) {

//        Master zhangsan = new Master();
//
//        Cat tom = new Cat();
//        zhangsan.feed(tom);
//
//        Dog jack = new Dog();
//        zhangsan.feed(jack);
//
        //以上方法没有使用到多态，Master类的扩展力不强
        //每养一个新宠物，就要给Master新添一个方法
        //Master和Cat、Dog关联性太强

        Master zhangsan = new Master();
        Cat tom = new Cat();
        zhangsan.feed(tom);

        Dog erHa = new Dog();
        zhangsan.feed(erHa);

        Snake mangShe = new Snake();
        zhangsan.feed(mangShe);

    }

}
