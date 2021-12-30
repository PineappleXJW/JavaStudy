package com.hunau.Array.ArrayTest01;

/**
 * 模拟一个系统，进入必须使用用户名和密码
 */


public class ArrayTest06 {
    //用户名和密码输入到String[] args数组中
    public static void main(String[] args) {
        if(args.length != 2){
            System.out.println("请输入用户名和密码，用空格分开，例如:zhangsan 123");
            return;
        }
        String username = args[0];

        String password = args[1];
        //假设用户名是admin，密码是123，表示成功，其他一律失败
//        if(username.equals("admin") && password.equals("123")){
        if("admin".equals(username) && "123".equals(password)){     //这种写法可以避免空指针异常，即使username和password都为空也可以
            System.out.println("登陆成功，欢迎[" + username + "]回来！");
        }else{
            System.out.println("验证失败，用户名不存在或密码错误！");
        }
    }
}
