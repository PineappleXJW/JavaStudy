package com.hunau.DuoTai01;

/**
 * @Systemname:Java学习练习
 * @Author:谢俊伟
 * @Description:
 * @Data:Created in 2021/1/21 12:40
 * @Unitname:湖南农业大学信科学院物联网工程系
 * @Copyright:谢俊伟 201841882121
 */
public class Cat extends Animal{
    public void move(){
        System.out.println("猫走猫步！");
    }

    //这个方法是子类特有的方法，不是从父类Animal中继承
    public void catchMouse(){
        System.out.println("猫抓老鼠！");
    }
}
