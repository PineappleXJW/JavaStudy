package com.hunau.InterfaceTest;

/**
 * @Systemname:Java学习练习
 * @Author:谢俊伟
 * @Description:
 * @Data:Created in 2021/3/15 22:16
 * @Unitname:湖南农业大学信科学院物联网工程系
 * @Copyright:谢俊伟 201841882121
 */
public class Test {
    public static void main(String[] args) {
        //创建厨师对象
        FoodMenu cooker1 = new EasternCooker();
        FoodMenu cooker2 = new WesternCooker();
        //创建顾客对象
        Customer customer1 = new Customer(cooker1);
        Customer customer2 = new Customer(cooker2);
        //顾客点菜
        customer1.order();
        customer2.order();
    }
}
