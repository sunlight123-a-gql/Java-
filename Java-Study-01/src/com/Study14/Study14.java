package com.Study14;

/**
 * ClassName Study14
 *
 * @Date2025/3/1522:42
 * @Create bysunlight
 */
public class Study14 {

    /**
     * 网络编程：
     *
     *
     * 软件架构：
     *      BS:浏览器/服务器：只需要一个浏览器，用户通过不同的网址，客户端访问不同的服务器*---*
     *      CS:客户端/服务端 需要用户在本地下载并安装客户端程序，，在远程有一个服务器端程序
     *
     * 网络编程三要素：
     *      1.IP：
     *          设备在网络中的地址，是唯一标识
     *      2.端口号：
     *          应用程序在设备的唯一标识
     *      3.协议：
     *          数据在网络中传输的规则，常见有UDP、TCP、http、https、ftp
     *
     *
     *  协议：
     *      连接和通信的规则被称为网络通信协议
     *  UDP协议：无连接、不可靠的协议
     *      1.用户数据报协议
     *      2.UDP是面向无连接的通信协议
     *      3.速度快，有大小限制一次最多发送64K，数据不安全，易丢失数据
     *  TCP协议：
     *      1.传输控制协议TCP
     *      2.TCP协议是面向连接的通信协议
     *      3.速度慢，没有大小限制，数据安全
     */


    /**
     * UDP三种通信方式：
     * 1.单播
     * 2.组播:
     *     组播地址： 224.0.0.0 ~ 239.255.255.255
     *     其中224.0.0.0 ~ 224.0.0.255为预留组播地址
     * 3.广播：
     *      广播地址： 255.255.255.255
     */


    /**
     * TCP通信程序:
     *      TCP通信协议是一种可靠的网络协议，它在通信的两端各建立一个Socket对象
     *      通信前要保证连接已经建立
     *      通过Socket产生IO流来进行网络通信
     *
     *      1.创建客户端的Socket对象，与指定服务端连接
     *      socket(String host,int port);
     *      2.获取输出流，写数据
     *      3.释放资源
     *
     */

}
