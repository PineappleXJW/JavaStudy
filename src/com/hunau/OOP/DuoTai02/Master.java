package com.hunau.OOP.DuoTai02;

/**
 * @Systemname:Java学习练习
 * @Author:谢俊伟
 * @Description:
 * @Data:Created in 2021/1/21 22:06
 * @Unitname:湖南农业大学信科学院物联网工程系
 * @Copyright:谢俊伟 201841882121
 */
public class Master {
    //Master主人类面向的是一个抽象的类Pet
    //建议Java编程都面向抽象的类，降低各类的耦合度，提高程序的扩展力
    public void feed(Pet pet){
        pet.eat();
    }
}
