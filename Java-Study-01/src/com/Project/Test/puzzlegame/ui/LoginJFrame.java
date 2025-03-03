package com.Project.Test.puzzlegame.ui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Random;

/**
 * ClassName LoginJFrame
 *
 * @Date2025/3/117:01
 * @Create bysunlight
 */
public class LoginJFrame extends JFrame implements ActionListener, MouseListener {


    //添加登录按钮
    JButton login = new JButton();

    //添加注册按钮
    JButton register = new JButton();

    JLabel codeText = new JLabel();

    JLabel rightCode = new JLabel();

    //添加用户名输入框
    JTextField userName = new JFormattedTextField();

    //添加密码输入框
    JTextField password = new JFormattedTextField();

    //添加验证码输入框
    JTextField code = new JFormattedTextField();

    /**
     * 1.创建一个登录界面
     * 获取用户输入的用户名
     * 获取用户输入的密码
     * 生成一个验证码
     * 获取用户输入的验证码
     * 比较用户名、密码、验证码
     */

    public LoginJFrame()
    {
        //初始化界面
        initLoginFrame();

        initView();

        this.setVisible(true);
    }

    private void initLoginFrame() {

        this.setSize(488,430);
        //设置界面的标题
        this.setTitle("拼图游戏 V1.0登录");
        //设置关闭模式
        this.setDefaultCloseOperation(3);
        //设置界面居中
        this.setLocationRelativeTo(null);
        //设置置顶
        this.setAlwaysOnTop(true);
        //取消内部默认布局
        this.setLayout(null);


    }

    public void initView()
    {
        //添加用户名文字
        JLabel usernameText = new JLabel(new ImageIcon("Java-Study-01\\src\\com\\Project\\Test\\puzzlegame\\image\\login\\用户名.png"));
        usernameText.setBounds(116,135,47,17);
        this.getContentPane().add(usernameText);

        //添加用户名输入框
        userName.setBounds(195,134,200,30);
        this.getContentPane().add(userName);

        //添加密码文字
        JLabel passwordText = new JLabel(new ImageIcon("Java-Study-01\\src\\com\\Project\\Test\\puzzlegame\\image\\login\\密码.png"));
        passwordText.setBounds(130,195,32,16);
        this.getContentPane().add(passwordText);

        //添加密码输入框
        password.setBounds(195,195,200,30);
        this.getContentPane().add(password);

        //添加验证码提示
        ImageIcon codeIcon =  new ImageIcon("Java-Study-01\\src\\com\\Project\\Test\\puzzlegame\\image\\login\\验证码.png");
        codeText = new JLabel(codeIcon);
        codeText.setBounds(133,256,50,30);
        this.getContentPane().add(codeText);
        codeText.addMouseListener(this);


        //添加验证码输入框
        code.setBounds(195,256,100,30);
        this.getContentPane().add(code);

        String codeStr = getCode();


        //设置内容
        rightCode.setText(codeStr);

        //设置位置和宽高
        rightCode.setBounds(300,256,50,30);
        //添加到界面
        this.getContentPane().add(rightCode);

        //添加登录按钮
        login.setBounds(123,310,128,47);
        login.setIcon(new ImageIcon("Java-Study-01\\src\\com\\Project\\Test\\puzzlegame\\image\\login\\登录按钮.png"));
        //去除按钮的边框
        login.setBorderPainted(false);
        //去除按钮的背景
        login.setContentAreaFilled(false);
        this.getContentPane().add(login);

        login.addActionListener(this);
        login.addMouseListener(this);


        //添加注册按钮
        register.setBounds(256,310,128,47);
        register.setIcon(new ImageIcon("Java-Study-01\\src\\com\\Project\\Test\\puzzlegame\\image\\login\\注册按钮.png"));
        //去除按钮边框
        register.setBorderPainted(false);
        //去除按钮的背景
        register.setContentAreaFilled(false);
        this.getContentPane().add(register);

        register.addActionListener(this);
        register.addMouseListener(this);

        //添加背景图片
        JLabel background = new JLabel(new ImageIcon("Java-Study-01\\src\\com\\Project\\Test\\puzzlegame\\image\\login\\background.png"));
        background.setBounds(0,0,470,390);
        this.getContentPane().add(background);
    }


    public void showDialog(String content)
    {
        //创建一个弹框对象
        JDialog jDialog = new JDialog();
        //给弹框设置大小
        jDialog.setSize(200,150);
        //让弹框置顶
        jDialog.setAlwaysOnTop(true);
        //让弹框居中
        jDialog.setLocationRelativeTo(null);
        //弹框不关闭永远无法操作下面的界面
        jDialog.setModal(true);
        //创建JLabel对象管理文字并添加到弹框当中
        JLabel warning = new JLabel(content);
        warning.setBounds(0,0,200,150);
        jDialog.getContentPane().add(warning);
        //让弹框显示出来
        jDialog.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        Object action = actionEvent.getSource();
        if (action == login)
        {
            System.out.println(rightCode.getText());
           if (checkUserNameAndPassword(userName.getText(),password.getText(),code.getText(),rightCode.getText()))
           {
               this.setVisible(false);
               new GameJFrame();
           }else {
               showDialog("账号密码错误");
           }

        }else if (action == register)
        {
            System.out.println("显示注册界面");
        }
    }

    private boolean checkUserNameAndPassword(String userName,String password,String codeStr,String rightCode)
    {
        if (!codeStr.equals(rightCode))
        {
            return false;
        }
        if (userName == null || password == null)
        {
            return false;
        }
        return true;
    }

    public String getCode()
    {
        //创建一个集合添加所偶的大写和小写字母
        ArrayList<Character> list = new ArrayList<>();
        for (int i = 0; i < 26; i++) {
            list.add((char)('a' + i));
        }
        for (int i = 0; i < 26; i++) {
            list.add((char)('A' + i));
        }
        StringBuilder stringBuilder = new StringBuilder();
        //要随机抽取4个字符
        Random r = new Random();
        for (int i = 0; i < 4; i++) {
            int index = r.nextInt(list.size());
            char c = list.get(index);
            stringBuilder.append(c);
        }
        int randomNum = r.nextInt(10);
        stringBuilder.append(randomNum);
        return stringBuilder.toString();
    }

    @Override
    public void mouseClicked(MouseEvent mouseEvent) {

    }

    @Override
    public void mousePressed(MouseEvent mouseEvent) {
       Object event =  mouseEvent.getSource();
       if (event == login)
       {
           login.setIcon(new ImageIcon("Java-Study-01\\src\\com\\Project\\Test\\puzzlegame\\image\\login\\登录按下.png"));
       }else if (event == register)
       {
           register.setIcon(new ImageIcon("Java-Study-01\\src\\com\\Project\\Test\\puzzlegame\\image\\login\\注册按下.png"));
       }
    }

    @Override
    public void mouseReleased(MouseEvent mouseEvent) {
        Object event = mouseEvent.getSource();
        if (event == login)
        {
            login.setIcon(new ImageIcon("Java-Study-01\\src\\com\\Project\\Test\\puzzlegame\\image\\login\\登录按钮.png"));
        }else if (event == register)
        {
            register.setIcon(new ImageIcon("Java-Study-01\\src\\com\\Project\\Test\\puzzlegame\\image\\login\\注册按钮.png"));
        }else if (event == codeText)
        {
            String code = getCode();
            rightCode.setText(code);
        }
    }

    @Override
    public void mouseEntered(MouseEvent mouseEvent) {

    }

    @Override
    public void mouseExited(MouseEvent mouseEvent) {

    }
}
