package com.Test.OOP.StudentTest;

import java.util.Scanner;

/**
 * ClassName Test
 *
 * @Date2025/2/2519:18
 * @Create bysunlight
 */
public class Test {


    public  static int maxLength = 3;


    public static void main(String[] args) {

        Operation();
    }

    public static void Operation() {

        Student[] students =  {
                new Student("heima002","小妹",18),
                new Student("heima003","小兰",20),
                new Student("heima004","小米",15)};
        Scanner scanner = new Scanner(System.in);
        int type;
        do {
            System.out.println("请输入你想执行的操作：1。添加对象   2. 删除对象 。 3.查询对象 4.退出");
            type = scanner.nextInt();
            switch (type) {
                case 1:
                   students =  addStudent(students);
                    for (int i = 0; i < students.length; i++) {
                        Student student = students[i];
                        System.out.println(student.getId() + "\t" + student.getName() + "\t" + student.getOld());
                    }
                    break;
                case 2:
                    System.out.println("请输入需要删除的学号：");
                    String userId = scanner.next();
                    students =  deleteStudent(students,userId);
                    break;
                case 3:
                    checkStudent(students,"heima002");
                    break;
                case 4:
                    System.out.println("退出程序");
                    break;
            }
        } while (type != 4) ;
    }

    public static Student[] addStudent(Student[] students)
    {
//        if (students.length >= maxLength)
//        {
//            System.out.println("没有办法存储更多的数据");
//            return;
//        }

        Scanner scanner = new Scanner(System.in);
        Student student = new Student();
        String userId;

        boolean isIdDuplicate;
        do {
            System.out.println("请输入学生的id:");
            userId = scanner.next();
            isIdDuplicate = false;
            for (int i = 0; i < students.length; i++) {
                Student student1 = students[i];
                if (student1.getId().equals(userId))
                {
                    System.out.println("当前id已存在，请重新输入");
                    isIdDuplicate = true;
                    break;
                }
            }
        }while (isIdDuplicate);
        student.setId(userId);
        System.out.println("请输入学生的姓名:");
        String userName = scanner.next();
        student.setName(userName);
        System.out.println("请输入学生的年龄：");
        int old = scanner.nextInt();
        student.setOld(old);
        int count = getCount(students);
        if (count >= students.length){
            students =  createNewArr(students);
            students[count] = student;
        }else {
            students[count] = student;
        }
        return students;
    }

    public static Student[] createNewArr(Student[] arr){
        Student[] students = new Student[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            students[i] = arr[i];
        }
        return students;
    }

    public static int getCount(Student[] arr){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null)
            {
                count++;
            }
        }
        return count;
    }

    public static Student[] deleteStudent(Student[] students,String userId){
        for (int i = 0; i < students.length; i++) {
            Student student = students[i];
            if (student.getId().equals(userId))
            {
                deleteArray(students,i);
            }
        }
        for (int i = 0; i < students.length; i++) {
            Student student = students[i];
            System.out.println(student.getId() + "\t" + student.getName() + "\t" + student.getOld());
        }
        return students;
    }


    public  static  void checkStudent(Student[] students,String userId)
    {
        for (int i = 0; i < students.length; i++) {
            Student student = students[i];
            if (student.getId() == userId)
            {
               int currentOld =  student.getOld() + 1;
               student.setOld(currentOld);
                System.out.println(student.getOld());
            }
        }
    }

    private static void deleteArray(Student[] students,int index)
    {
        Student[] newStudents = new Student[students.length - 1];
        int newIndex = 0;
        for (int i = 0; i < students.length; i++) {
            if (i != index) {
                // 将不是要删除索引位置的数据复制到新数组
                newStudents[newIndex++] = students[i];
            }
        }
    }

}
