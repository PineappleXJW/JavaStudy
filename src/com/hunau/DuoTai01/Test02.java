package com.hunau.DuoTai01;

/**
 * @Systemname:Java学习练习
 * @Author:谢俊伟
 * @Description:
 * @Data:Created in 2021/1/21 18:08
 * @Unitname:湖南农业大学信科学院物联网工程系
 * @Copyright:谢俊伟 201841882121
 */
public class Test02 {
    public static void main(String[] args) {
        Animal a1 = new Cat();
        Animal a2 = new Bird();

        if (a1 instanceof Cat){
            Cat c1 = (Cat)a1;
            c1.catchMouse();
        }
        if (a2 instanceof Bird){
            Bird b1 = (Bird)a2;
            b1.fly();
        }
    }
}
