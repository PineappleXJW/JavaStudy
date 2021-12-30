package com.hunau.Array.ArrayTest01;

import com.hunau.OOP.FinalTest01.B;
import com.hunau.OOP.FinalTest01.C;

/**
 * 一维数组的深入.数组中存储引用数据类型
 * 对于数组来说，实际上只能存储Java对象的内存地址
 */
public class ArrayTest07 {
    public static void main(String[] args) {
        //创建一个Animal类型的数据
        Animal a1 = new Animal();
        Animal a2 = new Animal();
        Animal[] animals = {a1,a2};

        //对Animal数组进行遍历
        for (int i = 0;i < animals.length; i++){
//            Animal a = animals[i];
//            a.move();
            animals[i].move();
        }
//        animals[0] = new Product();不同的类不能放进这个数组中
        animals[0] = new Cat();     //但是子类可以
        animals[1] = new Bird();
        animals[0].move();
        animals[1].move();

        Bird[] birds = new Bird[2];
//        birds[0] = new Cat();     父类的其他子类对象
//        birds[1] = new Animal();  父类对象          都不能放进这个数组中


        Cat c = new Cat();
        Bird b = new Bird();
        Animal[] anis = {c,b};

//        anis[i].hunt();   //在Animal类中没有hunt方法
        //调用子类中特有方法时，需要向下转型
        for(int i = 0;i<anis.length;i++){
            if(anis[i] instanceof Cat){
                Cat cat = (Cat)anis[i];
                cat.hunt();
            }else if(anis[i] instanceof Bird){
                Bird bird = (Bird)anis[i];
                bird.sing();
            }
        }
    }

}

class Animal{
    public void move(){
        System.out.println("Animal move...");
    }
}
class Product{

}
class Cat extends Animal {
    public void move(){
        System.out.println("猫走猫步...");
    }

    public void hunt(){
        System.out.println("猫抓老鼠...");
    }
}

class Bird extends  Animal{
    public void move(){
        System.out.println("Birds fly...");
    }
    public void sing(){
        System.out.println("Birds sing...");
    }
}