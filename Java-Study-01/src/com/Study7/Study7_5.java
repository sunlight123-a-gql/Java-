package com.Study7;

/**
 * ClassName Study7_5
 *
 * @Date2025/3/113:46
 * @Create bysunlight
 */
public class Study7_5 {



    /**类的五大成员
     *  1.属性：
     *  2.方法
     *  3.构造方法
     *  4.代码块
     *  5.内部类：
     *
     *
     * 内部类：表示的事物是外部类的一部分，内部类单独出现没有任何意义
     *
     *      特点：
     *          1.内部类可以直接访问外部类的成员，包括私有的
     *          2.外部类要访问内部类的成员，必须创建对象
     *
     *
     *      1.成员内部类：
     *          1.写在成员位置，属于外部类的成员
     *          2.成员内部类可以被一些修饰符锁修饰，如public、默认、protected、private、static等
     *          3.在成员内部类里面，JDK16之前不能定义静态变量，
     *
     *          格式：
     *          外部类名.内部类名 对象名 = new 外部类.new 内部类();
     *
     *      2.静态内部类：
     *          静态内部类只能访问外部类中的静态变量和静态方法，如果想要访问非静态的需要创建对象
     *
     *          创建静态内部类对象的格式：
     *              外部类名.内部类名 对象名 = new 外部类名.内部类名();
     *          调用非静态方法的格式：
     *              先创建对象，用对象调用
     *          调用静态方法的格式：
     *              外部类名.内部类名.方法名()
     *
     *
     *      3.局部内部类：
     *          1.将内部类定义在方法里面就叫做局部内部类，类似于方法里面的局部变量
     *          2.外界是无法直接使用，需要在方法内部创建对象并使用
     *          3.该类可以直接访问外部类的成员，也可以访问方法内的局部变量
     *
     *
     *
     *      4.匿名内部类：本质上就是隐藏了名字的内部类
     *          格式：
     *              new 类名或者接口名(){
     *                  重写方法;
     *              };
     *
     *          细节：
     *              1.包含了继承或实现，方法重写，创建对象
     *              2.整体就是一个类的子类对象或者接口的实现类对象
     *          使用场景：
     *              1.当方法的参数是接口或者类时
     *              2.以接口为例，可以传递这个接口的实现类对象
     *              3.如果实现类只要使用一次，就可以用匿名内部类简化代码
     *
     */


}
