package com.Test.StudentSystem;

import com.sun.org.apache.regexp.internal.RE;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * ClassName Test
 *
 * @Date2025/2/2720:24
 * @Create bysunlight
 */
public class Test {

    public static ArrayList<Student> studentArrayList = new ArrayList<>();

    public static ArrayList<User> userArrayList = new ArrayList<>();

    public static void main(String[] args) {
        mainPanel();
    }

    public static void mainPanel()
    {
        Scanner scanner = new Scanner(System.in);
        int selected = -1;
        while (selected != 4)
        {
            Panel();
            selected = scanner.nextInt();
            switch (selected)
            {
                case 1:
                    //登录界面
                    LoginPanel();
                    break;
                case 2:
                    //注册界面
                    registerUserInfo();
                    break;
                case 3:
                    //忘记密码
                    ForgotPassword();
                    break;
                case 4:
                    System.out.println("程序退出，请重新登录");
                    System.exit(0);
                case 5:
                    queryUserInfo();
                    break;
                default:
                    System.out.println("你输入的信息有误，请重新输入");
                    break;
            }
        }
    }

    public static void Panel(){
        System.out.println("----------------欢迎来到黑马学生管理系统初始界面-------------------");
        System.out.println("请选择你的操作：");
        System.out.println("1：登录");
        System.out.println("2：注册");
        System.out.println("3：忘记密码");
        System.out.println("4：退出");
        System.out.println("5：查询");
    }

    public static void registerUserInfo()
    {
        System.out.println("-----------------------注册界面--------------------------------");
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你的用户名：");
        String userName = scanner.next();
        System.out.println("请输入你的密码：");
        String password = scanner.next();
        System.out.println("请再次输入你的密码：");
        String passwordAgain = scanner.next();
        System.out.println("请输入你的身份证号码：");
        String identifyInfo = scanner.next();
        System.out.println("请输入你的手机号码：");
        String phone = scanner.next();
        boolean success = checkUserInfo(userName,password,passwordAgain,identifyInfo,phone);
        if (success)
        {
            System.out.println("注册成功");
        }else {
            System.out.println("注册失败，你的用户名或者密码输入格式有问题，请稍后重试");
        }
    }



    public static void LoginPanel()
    {
        boolean flag = false;
        for (int i = 1; i <= 3 ; i++) {
            System.out.println("-----------------------登录界面--------------------------------");
            Scanner scanner = new Scanner(System.in);
            System.out.print("请输入你的用户名：" + "\t");
            String userName = scanner.next();
            System.out.print("请输入你的密码：" + "\t");
            String password = scanner.next();
            String code = getCode();
            System.out.print("当前验证码为：" + code);
            System.out.println("请输入你的验证码：");
            String newCode = scanner.next();
            boolean success = checkUserInfo(userName,password);
            boolean successCode = code.equals(newCode);
            if (success && successCode)
            {
                flag = true;
                break;
            }
        }
        if (flag)
        {
            ManagementSystem();
        }else {
            System.out.println("你输入的用户名或者密码有问题，请稍后重试");
        }
        return;
    }

    public static void ForgotPassword()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你的用户名:");
        String userName = scanner.next();
        if (!checkUserName(userName))
        {
            System.out.println("你输入的用户名不存在，未注册，请稍后再试");
            return;
        }
        System.out.println("请输入你的身份证号码:");
        String identify = scanner.next();
        System.out.println("请输入你的手机号码:");
        String phone = scanner.next();
        if (!checkIdentifyAndPhone(identify,phone))
        {
            System.out.println("账号信息不匹配，修改失败");
            return;
        }
        int index = getUserInfoByUserId(userName);
        System.out.println("请输入新的密码:");
        String password = scanner.next();
        userArrayList.get(index).setPassword(password);
        System.out.println("修改成功，请重新登录");
    }

    private static String getCode()
    {
        //创建一个集合添加所偶的大写和小写字母
        ArrayList<Character> list = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            list.add((char)('a' + i));
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

    //获取对应信息的索引
    public static int getUserInfoByUserId(String userName)
    {
        for (int i = 0; i < userArrayList.size(); i++) {
            if (userArrayList.get(i).getUserName().equals(userName))
            {
                return i;
            }
        }
        return -1;
    }

    //检查你的身份证号码和手机号码是否一致
    public static boolean checkIdentifyAndPhone(String identify,String phone)
    {
        for (int i = 0; i < userArrayList.size(); i++) {
            User user = userArrayList.get(i);
            if (!user.getIdentify().equals(identify) || !userArrayList.get(i).getPhone().equals(phone))
            {
                return false;
            }
        }
        return true;
    }

    //检查用户信息
    public static boolean checkUserInfo(String userName,String password,String passwordAgain,String identify,String phone)
    {
        //唯一性判断
        boolean success =  checkUserName(userName);
        if (success)
        {
            System.out.println("用户名已存在，请返回重新输入");
            return false;
        }

        //长度判断
        if (userName.length() > 15 || userName.length() < 3)
        {
            System.out.println("你输入的信息有误");
        }

        //只能是数字加字母的组合，不能是纯数字
        char[] chars = userName.toCharArray();
        boolean start = false;
        boolean end = false;
        for (int i = 0; i < chars.length; i++) {
            if (Character.isDigit(chars[i]))
            {
                start = true;
            }
            if (Character.isLowerCase(chars[i])||Character.isUpperCase(chars[i]))
            {
                end = true;
            }
        }
        if (!start || !end)
        {
            System.out.println("你输入的用户名格式不对，请重新输入!");
            return false;
        }

        if (!passwordAgain.equals(password))
        {
            System.out.println("你输入的两次密码不一致，请重新输入");
            return false;
        }

        //检查身份证号码是否正确，格式是，前17位都是数字，不能是0开头，最后一位可以是大写或者小写字母X
        if (identify.length() != 18)
        {
            return false;
        }
        char[] chars1 = identify.toCharArray();
        for (int i = 0; i < chars1.length; i++) {
            char c = chars1[i];
            if (i == 0)
            {
                if (c == '0')
                {
                    System.out.println("你的身份证号码第一位是0");
                    return false;
                }
            }
            if (i < chars1.length-1)
            {
                if (!Character.isDigit(c))
                {
                    System.out.println("你的身份证号码不是数字");
                    return false;
                }
            }
            if (i == chars1.length-1)
            {
                if (c != 'X' && c != 'x' && !Character.isDigit(c))
                {
                    System.out.println("你的身份证号码最后一位出现问题");
                    return false;
                }
            }
        }


        //检查手机号码是否正确，格式是，11位都是数字，不能是0开头
        if (phone.length() != 11)
        {
            return false;
        }
        char[] chars2 = identify.toCharArray();
        for (int i = 0; i < chars2.length; i++) {
            char c = chars2[i];
            if (i == 0)
            {
                if (c == '0')
                {
                    System.out.println("你的手机号码第一位是0");
                    return false;
                }
            }

            if (!Character.isDigit(c))
            {
                System.out.println("你的手机号码不是数字");
                return false;
            }
        }

        User user = new User();
        user.setUserName(userName);
        user.setPassword(password);
        user.setIdentify(identify);
        user.setPhone(phone);
        userArrayList.add(user);
        return true;
    }



    private static boolean checkUserName(String userName)
    {
        for (int i = 0; i < userArrayList.size(); i++) {
            if (userArrayList.get(i).getUserName().equals(userName))
            {
                return true;
            }
        }
        return false;
    }

    private static boolean checkUserInfo(String userName,String password)
    {
        for (int i = 0; i < userArrayList.size(); i++) {
            User user = userArrayList.get(i);
            if (user.getUserName().equals(userName))
            {
                if (user.getPassword().equals(password))
                {
                    return true;
                }
            }

        }
        return false;
    }

    public static void queryUserInfo()
    {
        for (int i = 0; i < userArrayList.size(); i++) {
            System.out.println(userArrayList.get(i).getUserName() + "\t" + userArrayList.get(i).getPassword() + "\t" + userArrayList.get(i).getIdentify() + "\t" + userArrayList.get(i).getPhone());
        }
    }

    //学生管理系统
    public static void ManagementSystem()
    {
        Scanner scanner = new Scanner(System.in);
        int selected = -1;
        while (selected != 5)
        {
            MainMenu();
            selected = scanner.nextInt();
            switch (selected)
            {
                case 1:
                    //添加学生信息
                    addStudentInfo(studentArrayList);
                    break;
                case 2:
                    //删除学生信息
                    deleteStudent(studentArrayList);
                    break;
                case 3:
                    //修改学生信息
                    setStudentById(studentArrayList);
                    break;
                case 4:
                    //查询所有学生信息
                    queryStudent(studentArrayList);
                    break;
                case 5:
                    System.out.println("程序退出，请重新登录");
                    break;
                default:
                    System.out.println("你输入的信息有误，请重新输入");
                    break;
            }
        }
    }

    //主菜单
    public static void MainMenu()
    {
        System.out.println("--------------------欢迎来到黑马学生管理系统----------------------");
        System.out.println("1:添加学生");
        System.out.println("2：删除学生");
        System.out.println("3：修改学生");
        System.out.println("4：查询学生");
        System.out.println("5：返回登录界面");
        System.out.println("请输入你的选择");
    }

    public static void addStudentInfo(ArrayList<Student> students)
    {
        System.out.println("----------------------添加学生信息------------------------------");

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你的学生id： ");
        String id = scanner.next();
        if (checkUserId(students,id))
        {
            System.out.println("用户id存在，请稍后再试");
            return;
        }
        System.out.println("请输入你的姓名:");
        String userName = scanner.next();
        System.out.println("请输入你的年龄:");
        int age = scanner.nextInt();
        System.out.println("请输入你的地址");
        String address = scanner.next();
        Student student = new Student();
        student.setId(id);
        student.setName(userName);
        student.setAge(age);
        student.setAddress(address);
        students.add(student);
        return;
    }

    //检查用户id是否在系统中存在
    private static boolean checkUserId(ArrayList<Student> students,String id)
    {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getId().equals(id))
            {
                return true;
            }
        }
        return false;
    }

    //删除学生信息
    public static void deleteStudent(ArrayList<Student> students)
    {
        System.out.println("----------------------删除学生信息------------------------------");

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你的学生id： ");
        String id = scanner.next();
        int index = getIdByIndex(students,id);
        if (index == -1)
        {
            System.out.println("用户信息不存在，请稍后再试");
            return;
        }
        students.remove(index);
        System.out.println("用户信息已删除");
        return;
    }

    private static int getIdByIndex(ArrayList<Student> students,String id)
    {
        int index = -1;
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getId().equals(id))
            {
                return i;
            }
        }
        return index;
    }

    //修改学生信息
    public static void setStudentById(ArrayList<Student> students)
    {
        System.out.println("----------------------修改学生信息------------------------------");

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你的学生id： ");
        String id = scanner.next();
        if (!checkUserId(students,id))
        {
            System.out.println("用户信息不存在，请稍后再试");
            return;
        }
        int index = getIdByIndex(students,id);
        System.out.println("请输入你修改后的的名字信息:");
        String userName = scanner.next();
        students.get(index).setName(userName);
        return;
    }

    //查询学生信息
    public static void queryStudent(ArrayList<Student> students)
    {
        if (students.size() == 0)
        {
            System.out.println("当前无学生信息，请添加后再查询");
            return;
        }
        System.out.println("----------------------查询学生信息------------------------------");
        System.out.println("id" + "\t" + "姓名" + "\t" + "年龄" + "\t" + "家庭住址");
        for (int i = 0; i < students.size(); i++) {
            Student student = students.get(i);
            System.out.print(student.getId() + "\t" + student.getName() + "\t" + student.getAge() + "\t" + student.getAddress());
        }
        System.out.println();
    }

}
