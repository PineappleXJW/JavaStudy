package com.hunau.InterfaceTest;

/**
 * @Systemname:Java学习练习
 * @Author:谢俊伟
 * @Description:
 * @Data:Created in 2021/3/15 21:31
 * @Unitname:湖南农业大学信科学院物联网工程系
 * @Copyright:谢俊伟 201841882121
 */

/**
 * 西餐厨师
 */
public class WesternCooker implements FoodMenu{

    public void tomatoeggs() {
        System.out.println("西餐厨师做的西红柿炒蛋！");
    }


    public void fishmeat() {
        System.out.println("西餐厨师做的鱼香肉丝！");
    }
}
