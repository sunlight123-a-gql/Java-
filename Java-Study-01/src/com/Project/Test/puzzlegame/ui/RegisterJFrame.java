package com.Project.Test.puzzlegame.ui;

import javax.swing.*;

/**
 * ClassName RegisterJFrame
 *
 * @Date2025/3/117:01
 * @Create bysunlight
 */
public class RegisterJFrame extends JFrame {


    /**
     * 1.创建一个注册界面
     * 获取用户输入的用户名
     * 获取用户输入的密码-两次
     * 比较用户两次输入的密码是否一致，比较用户名是否存在
     */

    public RegisterJFrame()
    {
        this.setSize(488,500);

        //设置界面的标题
        this.setTitle("拼图注册界面");

        //设置界面居中
        this.setLocationRelativeTo(null);

        //设置关闭模式
        this.setDefaultCloseOperation(3);

        this.setVisible(true);
    }

}
