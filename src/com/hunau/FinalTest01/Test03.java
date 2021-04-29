package com.hunau.FinalTest01;

/**
 * @Systemname:Java学习练习
 * @Author:谢俊伟
 * @Description:
 * @Data:Created in 2021/1/22 16:23
 * @Unitname:湖南农业大学信科学院物联网工程系
 * @Copyright:谢俊伟 201841882121
 */
public class Test03 {
    public static void main(String[] args) {
        User u = new User(100);
        u = new User(200);

        final User user = new User(50);
        //user = new User(250);//这里就不行了
    }


}
