package com.hunau.OOP.Access;

/**
 * @Systemname:Java学习练习
 * @Author:谢俊伟
 * @Description:
 * @Data:Created in 2021/1/22 16:48
 * @Unitname:湖南农业大学信科学院物联网工程系
 * @Copyright:谢俊伟 201841882121
 */

/**
 * 访问控制权限修饰符：
 *      1、访问控制权限修饰符来控制元素的访问范围
 *      2、访问控制权限修饰符包括：
 *          public      表示公开的，在【任何位置】都能访问
 *          protected   表示受保护的,【同包】以及【子类】中能访问
 *          缺省         表示不写权限修饰符，只有【同包】中能访问
 *          private     表示私有的，只能在【本类】中方位
 *      3、修饰符的范围：
 *          private < 缺省 < protected < public
 *      4、【类】只能用【public】和【缺省】来修饰！
 */
public class Test01 {
    public static void main(String[] args) {
        User u = new User();
        System.out.println(u.i);
        System.out.println(u.j);
    }
}
