package com.hunau.OOP.MethodTest.equalsTest;

/**
 * @Systemname:Java学习练习
 * @Author:谢俊伟
 * @Description:
 * @Data:Created in 2021/4/15 16:57
 * @Unitname:湖南农业大学信科学院物联网工程系
 * @Copyright:谢俊伟 201841882121
 */
public class Test03 {
    public static void main(String[] args) {
        Student s1 = new Student(2121,"hunau");
        Student s2 = new Student(2121,"hunau");
        Student s3 = new Student(2122,"hunau");
        Student s4 = new Student(2121,"szdx");

        boolean b1 = s1.equals(s2);
        boolean b2 = s1.equals(s3);
        boolean b3 = s1.equals(s4);
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
    }
}

class Student{
    int no;
    String school;

    public Student() {
    }

    public Student(int no) {
        this.no = no;
    }

    public Student(String school) {
        this.school = school;
    }

    public Student(int no, String school) {
        this.no = no;
        this.school = school;
    }

    /*
    重写toString方法
    */
    @Override
    public String toString() {
        return "学号为" + no + ", 所在学校为" + school;
    }
    /*
    重写equals方法：
        需求：当一个学生的学号相等，并且学校相同，则表示同一个学生
     */
    @Override
    public boolean equals(Object o) {
        if(o == null || !(o instanceof Student)) return false;
        if(this == o) return true;
        Student s = (Student)o;
        return s.no == this.no && this.school.equals(s.school);
    }
}
