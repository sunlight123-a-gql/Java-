package com.Project.Test.puzzlegame.ui;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

/**
 * ClassName GameJFrame
 *
 * @Date2025/3/116:58
 * @Create bysunlight
 */
public class GameJFrame extends JFrame implements KeyListener, ActionListener {

    //ctrl + alt + M: 将一段代码合成为一段方法


    //JFrame 界面，窗体
    //子类呢？也表示界面，窗体
    //规定：GameJFrame这个界面表示的就是游戏的主界面
    //

    //创建选项下面的条目对象
    JMenuItem replyItem = new JMenuItem("重新游戏");

    JMenuItem reLoginItem = new JMenuItem("重新登录");

    JMenuItem closeItem = new JMenuItem("关闭游戏");

    JMenuItem accountItem = new JMenuItem("公众号");

    JMenuItem girlItem = new JMenuItem("美女");

    JMenuItem animalItem = new JMenuItem("动物");

    JMenuItem sportItem = new JMenuItem("运动");

    int[] animamlItems = {1,2,3,4,5,6,7,8};
    int[] girlItems = {1,2,3,4,5,6,7,8,9,10,11,12,13};
    int[] sportItems = {1,2,3,4,5,6,7,8,9,10};

    int[][] data = new int[4][4];

    int[][] win = new int[][]{
        {1,2,3,4},
        {5,6,7,8},
        {9,10,11,12},
        {13,14,15,16}
    };

    int step = 0;

    //记录空白方块在二维数组的位置
    int x = 0;
    int y = 0;

    String path = "Java-Study-01\\src\\com\\Project\\Test\\puzzlegame\\image\\animal\\animal3\\";
    //创建一个游戏界面
    /**
     * 上下左右移动的代码逻辑
     * 统计步数的代码逻辑
     * 一键通关
     * 查看最终结果
     * 恶搞好基友
     */
    public GameJFrame()
    {
        //初始化界面
        InitJFrame();

        //初始化菜单
        InitJMenuBar();

        //初始化数据（打乱）
        InitData();

        //初始化图片
        initImage();

        //界面显示
        this.setVisible(true);
    }


    private void InitData() {
        //定义一个数组
        int[] tempArr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};
        Random random = new Random();
        for (int i = 0; i < tempArr.length; i++) {
            int index = random.nextInt(tempArr.length);
            int temp = tempArr[i];
            tempArr[i] = tempArr[index];
            tempArr[index] = temp;
        }

        for (int i = 0; i < tempArr.length; i++) {
            if (tempArr[i] == 16)
            {
                x = i / 4;
                y = i % 4;
            }
            data[i/4][i%4] = tempArr[i];

        }
    }



    private void initImage()
    {
        //清空当前界面
        this.getContentPane().removeAll();

        if (victory())
        {
            JLabel winJlabel = new JLabel(new ImageIcon("Java-Study-01\\src\\com\\Project\\Test\\puzzlegame\\image\\win.png"));
            winJlabel.setBounds(203,283,197,73);
            this.getContentPane().add(winJlabel);
        }

        JLabel stepCount = new JLabel("步数: "+ step);
        stepCount.setBounds(50,30,100,20);
        this.getContentPane().add(stepCount);

        for (int i = 0; i < 4 ; i++) {
            for (int j = 0; j < 4; j++) {
                int num = data[i][j];
                //创建一个图片的ImageIcon的对象
                ImageIcon icon = new ImageIcon(path+num +".jpg");
                //创建一个JLabel的对象(容器)
                JLabel jLabel = new JLabel(icon);
                //指定图片位置
                jLabel.setBounds(105*j+83,105*i+134,105,105);
                //给图片添加边框   边框的大小 0 表示让图片凸出来，1表示图片凹下去
                jLabel.setBorder(new BevelBorder(1));
                //把管理容器添加到界面中去
                //this.add(jLabel);
                this.getContentPane().add(jLabel);
                //添加一次之后num需要自增,表示下次加载后面一张图片
            }
        }

        //添加北京图片
        ImageIcon bgIcon = new ImageIcon("Java-Study-01\\src\\com\\Project\\Test\\puzzlegame\\image\\background.png");
        JLabel background = new JLabel(bgIcon);
        background.setBounds(40,40,508,560);
        this.getContentPane().add(background);

        //刷新界面
        this.getContentPane().repaint();
    }



    //初始化菜单
    private void InitJMenuBar()
    {

        //创建整个的菜单对象
        JMenuBar jMenuBar = new JMenuBar();
        jMenuBar.setSize(80,680);

        JMenu fuctionMenu = new JMenu("功能");
        JMenu aboutMenu = new JMenu("联系我们");
        JMenu changePicture = new JMenu("更换图片");


        changePicture.add(girlItem);
        changePicture.add(animalItem);
        changePicture.add(sportItem);

        replyItem.addActionListener(this);
        reLoginItem.addActionListener(this);
        closeItem.addActionListener(this);
        accountItem.addActionListener(this);

        girlItem.addActionListener(this);
        animalItem.addActionListener(this);
        sportItem.addActionListener(this);

        //将每一个选项下面的条目添加到选项当中
        fuctionMenu.add(changePicture);
        fuctionMenu.add(replyItem);
        fuctionMenu.add(reLoginItem);
        fuctionMenu.add(closeItem);
        aboutMenu.add(accountItem);

        //将菜单里面的两个选项添加到菜单当中
        jMenuBar.add(fuctionMenu);
        jMenuBar.add(aboutMenu);

        this.setJMenuBar(jMenuBar);
    }


    //初始化界面信息
    private void InitJFrame()
    {
        //比如，宽高，直接展示出来
        this.setSize(603,680);

        //设置界面的标题
        this.setTitle("拼图单机版本 v1.0");

        //设置页面置顶
        this.setAlwaysOnTop(true);

        //设置界面居中
        this.setLocationRelativeTo(null);

        //设置关闭模式
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        //取消默认居中放置，只有取消了才会按照XY轴的形式添加组件
        this.setLayout(null);

        //给整个界面添加键盘监听事件
        this.addKeyListener(this);
    }


    @Override
    public void keyTyped(KeyEvent keyEvent) {

    }

    //按下不松时调用这个方法
    @Override
    public void keyPressed(KeyEvent keyEvent) {
        int code = keyEvent.getKeyCode();
        if (code == 65)
        {
            //把界面中所有图片全删除掉
            this.getContentPane().removeAll();
            //加在第一张完整的图片
            ImageIcon allNew = new ImageIcon(path+"all.jpg");
            JLabel all = new JLabel(allNew);
            all.setBounds(83,134,420,420);
            this.getContentPane().add(all);
            //添加北京图片
            ImageIcon bgIcon = new ImageIcon("Java-Study-01\\src\\com\\Project\\Test\\puzzlegame\\image\\background.png");
            JLabel background = new JLabel(bgIcon);
            background.setBounds(40,40,508,560);
            this.getContentPane().add(background);
            //刷新界面
            this.getContentPane().repaint();
        }
    }

    @Override
    public void keyReleased(KeyEvent keyEvent) {

        //判断游戏是否胜利，如果胜利，此方法需要直接结束，不再执行下面的移动逻辑
        if (victory())
        {
            return;
        }

        int code  = keyEvent.getKeyCode();
        if (code == 37)
        {
            if (y == 3)
            {
                return;
            }
            System.out.println("向左移动");
            //把空白方块下方的数字赋值给空白方块
            data[x][y] = data[x][y+1];
            data[x][y+1] = 16;
            y++;
            //调用方法按照最新的数字加载图片
            step++;
            initImage();
        }else if (code == 38)
        {
            if (x == 3)
            {
                return;
            }
            System.out.println("向上移动");
            //把空白方块下方的数字赋值给空白方块
            data[x][y] = data[x+1][y];
            data[x+1][y] = 16;
            x++;
            //调用方法按照最新的数字加载图片
            step++;
            initImage();
        }else if (code == 39){
            if (y == 0)
            {
                return;
            }
            System.out.println("向右移动");
            //把空白方块下方的数字赋值给空白方块
            data[x][y] = data[x][y-1];
            data[x][y-1] = 16;
            y--;
            //调用方法按照最新的数字加载图片
            step++;
            initImage();
        }else if (code == 40){
            System.out.println("向下移动");
            if (x == 0)
            {
                return;
            }
            //把空白方块上方的数字赋值给空白方块
            data[x][y] = data[x-1][y];
            data[x-1][y] = 16;
            x--;
            //调用方法按照最新的数字加载图片
            step++;
            initImage();
        }else if (code == 65)
        {
            initImage();
        }else if (code == 87)
        {
            data = new int[][]{
                    {1,2,3,4},
                    {5,6,7,8},
                    {9,10,11,12},
                    {13,14,15,16}
            };
            initImage();
        }
    }

    //判断data中数据是否跟win数组数据相同
    private boolean victory(){
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                if (data[i][j] != win[i][j])
                {
                    return false;
                }
            }
        }
        return true;
    }

    //给条目绑定事件
    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        Object action = actionEvent.getSource();
        if (action == replyItem)
        {
            step = 0;
            InitData();
            initImage();
        }else if (action == reLoginItem)
        {
            System.out.println("重新登录");
            this.setVisible(false);
            new LoginJFrame();
        }else if (action == closeItem)
        {
            System.out.println("关闭游戏");
            System.exit(0);
        }else if (action == accountItem)
        {
            System.out.println("关于我们");
            //创建一个弹框对象
            JDialog jDialog = new JDialog();
            JLabel jLabel = new JLabel(new ImageIcon("Java-Study-01\\src\\com\\Project\\Test\\puzzlegame\\image\\about.png"));
            jLabel.setBounds(0,0,258,258);
            jDialog.getContentPane().add(jLabel);
            //给弹框设置大小
            jDialog.setSize(344,344);
            //让弹框置顶
            jDialog.setAlwaysOnTop(true);
            //让弹框居中
            jDialog.setLocationRelativeTo(null);
            //让弹框不关闭则无法操作下面的界面
            jDialog.setModal(true);
            //让弹框显示出来
            jDialog.setVisible(true);

        }else if (action == animalItem)
        {
            System.out.println("选择动物图片");
            String item = "animal";
            changePuzzle(animamlItems,item);
        }else if (action == girlItem)
        {
            System.out.println("选择美女图片");
            String item = "girl";
            changePuzzle(girlItems,item);
        }else if (action == sportItem)
        {
            System.out.println("选择体育图片");
            String item = "sport";
            changePuzzle(sportItems,item);
        }
    }

    private void  changePuzzle(int[] arr,String item)
    {
        Random random = new Random();
        int randomIndex = random.nextInt(arr.length);
        int num = arr[randomIndex];
        String items = item + num;
        path = "Java-Study-01\\src\\com\\Project\\Test\\puzzlegame\\image\\"+item+"\\"+items+"\\";
        InitData();
        initImage();
    }
}
