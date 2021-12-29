目前为止要掌握的方法有：
    protected Object clone();   //负责对象的克隆
    int hashCode();             //获取对象哈希值的方法
    boolean equals(Object obj); //判断两个对象是否相等
    String toString();          //将对象转换成字符形式
    protected void finalize();  //垃圾回收器负责调用的方法

1、toString()方法：
    以后所有类的toString()方法是需要重写的，写的越简单明了越好。
    System.out.println(引用); 这里会自动调用”引用的toString()“方法。
    String方法类是SUN写的，toString方法已经重写了

2、equals()方法：
    以后所有类的equals方法也需要重写，因为Object中的equals方法比较的是两个对象的内存地址，我们应该比较内容，所以需要重写

    重写规则：自己定，主要看是什么和什么相等时表示两个对象相等。

    基本数据类型比较时，用==
    对象和对象比较时，用equals方法

    String类是SUN编写的，所以String类的equals方法重写了。
    以后判断两个字符串是否相等，最好不要使用 == ，要调用字符串对象的equals方法。

3、finalize()方法：
    这个方法是时protected修饰的，