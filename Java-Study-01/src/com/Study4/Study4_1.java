package com.Study4;

/**
 * ClassName Study4_1
 *
 * @Date2025/2/243:24
 * @Create bysunlight
 */
public class Study4_1 {

    /**
     * 面向对象内容：
     *      一、类、对象：（在Java中，必须先设计类、然后才能获得对象）
     *          1.类：对象的共同特征的描述
     *              格式(如何定义类)：
     *                  public class 类名{
     *                      1.成员变量（代表属性，一般是名词）
     *                      2.成员方法（代表行为，一般是动词）
     *                      3.构造器
     *                      4.代码块
     *                      5.内部类
     *                  }
     *          2.对象：真实存在的具体东西
     *
     *      1.封装：
     *          (对象代表什么，就得封装对应的数据，并提供数据对应的行为)
     *
     *          private: 被其修饰的成员只能在本类中才能访问
     *              针对每一个私有化的成员变量，提供对应的get和set方法。
     *              get方法：对外提供成员变量的值
     *              set方法：给成员变量赋值
     *
     *      2.this关键字：
     *             可以区分成员变量和局部变量
     *
     *      3.构造方法:
     *          格式：
     *              修饰符 类名（参数）
     *              {
     *                  方法体;
     *              }
     *          特点：
     *              1.方法名与类名相同，大小写也要一致
     *              2.没有返回值类型，连void都没有
     *              3.没有具体的返回值（不能由return带回结果数据）
     *
     *
     *              4.如果我们没有写任何构造方法，虚拟机会提供一个空参构造方法
     *              5.如果定义了构造方法，系统将不再提供默认的构造方法
     *
     *          执行时机：
     *              1.创建对象的时候由虚拟机调用，不能手动调用构造方法
     *              2.每创建一次对象，就会调用一次构造方法
     *
     *
     *          使用时机：
     *              无论是否使用，都手动书写无参数构造方法，和带全部参数的构造方法
     *
     *
     *          构造方法：
     *              无参数构造方法：初始化的对象时，成员变量的数据均采用默认值
     *              有参数构造方法：在初始化对象时，同时可以为对象进行赋值
     *
     *
     *      4.标准JavaBean
     *
     *
     *      5.对象内存图
     *          1。一个对象的内存图：
     *              类名 变量名 = new 类();
     *                  1.加载class文件（在方法区执行）
     *                  2.申明局部变量
     *                  3.在堆内存中开辟一个空间
     *                  4.默认初始化
     *                  5.显示初始化
     *                  6.构造方法初始化
     *                  7.将堆内存中的地址赋值给左边的局部变量
     *
     *          2. 多个对象的内存图
     *          3. 两个变量指向同一个对象的内存图
     *          4. this的内存原理
     *          5. 基本数据类型和引用数据空类型的区别
     *          6. 局部变量和成员变量的区别
     *
     *      6.成员变量、局部变量区别:
     *          就近原则：
     */
}
