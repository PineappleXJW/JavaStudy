package com.hunau.OOP.InterfaceTest;

/**
 * @Systemname:Java学习练习
 * @Author:谢俊伟
 * @Description:
 * @Data:Created in 2021/3/15 21:31
 * @Unitname:湖南农业大学信科学院物联网工程系
 * @Copyright:谢俊伟 201841882121
 */

/**
 * 顾客类
 *  顾客手里有菜单
 *  Customer has a FoodMenu!（这句话什么意思：顾客手里有菜单）
 *  凡是能够用has a 描述的，统一以属性的方式存在
 */
public class Customer{
    private FoodMenu foodMenu;

    public void order(){
        foodMenu.tomatoeggs();
        foodMenu.fishmeat();
    }
    //构造方法
    public Customer(FoodMenu foodMenu) {
        this.foodMenu = foodMenu;
    }
    //setter and getter
    public void setFoodMenu(FoodMenu foodMenu) {
        this.foodMenu = foodMenu;
    }
    public FoodMenu getFoodMenu() {
        return foodMenu;
    }
}
