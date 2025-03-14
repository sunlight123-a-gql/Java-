package com.Study8;

import java.util.Objects;

/**
 * ClassName Study8
 *
 * @Date2025/3/313:19
 * @Create bysunlight
 */
public class Study8 {

    /**
     * Math:与数学相关的方法
     *      abs：获取绝对值
     *      absExact：获取绝对值，这个不会出现负数的情况
     *      ceil：向上取整
     *      floor：向下取整
     *      round：四舍五入
     *      max：获取最大值
     *      min：获取最小值
     *      pow：获取a的b次幂
     *      sqrt：开平方根
     *      cbrt：开立方根
     *      random：获取[0.0,1.0）之间的随机数
     *
     * System: 与系统相关的方法
     *      exit:终止当前java虚拟机 -- 底层调用的RunTime方法
     *      currentTimeMillis() 返回当前系统的时间毫秒值类型   计算机中的时间原点：1970年1月1日 00:00:00
     *      arraycopy:数组拷贝：
     *         参数结构：
     *          参数一：数据源
     *          参数二：从数据源的第几个索引开始拷贝
     *          参数三：目的地
     *          参数四：目的地数组的索引
     *          参数五：拷贝的个数
     *        注意：
     *          1.如果数据源数组和目的地数组都是基本数据类型，那么两者的类型必须保持一致，否则会报错
     *          2.在拷贝的时候需要考虑数组的长度，如果超出范围也会报错
     *
     * Runtime:表示当前虚拟机的运行环境
     *      exit：停止虚拟机
     *      getRuntime(): 当前系统的运行环境对象
     *      availableProcessors();获取CPU的线程数
     *      maxMemory：JVM能从系统中获取总内存大小（单位byte）
     *      totalMemory；JVM已经从系统中获取的总内存大小
     *      freeMemory:JVM剩余内存大小
     * Object:顶级父类
     *      toString():返回的是全类名@地址值
     *      equals：
     *      对象克隆：
     *          1.重写Object中的clone方法
     *          2.让javabean类实现Cloneable接口
     *          3.创建原对象并调用clone就可以
     *
     *
     *        1.浅拷贝：（修改之后，两个都会发生改变）
     *          基本数据类型拷贝数据值
     *          引用数据类型拷贝地址值
     *
     *        2.深拷贝：（除了内容相同外，其他没有关联）
     *          基本数据拷贝数据值，字符串是复用
     *          引用数据类型会重新创建新的，将原来的数据复制过来
     *
     * Objects:
     *      equals:先做非空判断，比较两个对象
     *      isNull：判断对象师傅时null，如果是，为true
     *      nonNull：判断对象时否是null，如果不是null，为true
     *
     * 正则表达式:
     *
     *
     * 时间类：
     * Date类：
     *      1.ZoneId：时区
     *      2.Instant：时间戳
     *      3.ZoneDateTime：带时区的时间
     *
     * SimpleDateFormat：
     *      1.DateTimeFormater：用于时间的格式化和解析
     *
     * Calendar：
     *      1.LocalDate：年、月、日
     *      2.LocalTime：时、分、秒
     *      3.LocalDateTime：年、月、日、时、分、秒
     *
     * 工具类：
     *      1.Duration：时间间隔（秒、纳秒）
     *      2.Period：时间间隔（年、月、日）
     *      3.ChronoUnit：时间间隔（所有单位）
     *
     */

}
