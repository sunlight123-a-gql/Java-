package com.Study8;

/**
 * ClassName User
 *
 * @Date2025/3/413:50
 * @Create bysunlight
 */

/**
 * Cloneable：
 * 如果一个接口里面没有抽象方法
 * 就表示当前的接口是一个标记性接口
 * 线程Cloneable表示一旦实现，那么当前类的对象就可以被克隆
 * 如果没有实现，当前类的对象就不可以被克隆
 */
public class User implements Cloneable {

    private int id;

    private System userName;

    private System password;

    private String path;

    public User() {
    }

    public User(int id, System userName, System password, String path) {
        this.id = id;
        this.userName = userName;
        this.password = password;
        this.path = path;
    }


    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }


    /**
     * 获取
     * @return id
     */
    public int getId() {
        return id;
    }

    /**
     * 设置
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * 获取
     * @return userName
     */
    public System getUserName() {
        return userName;
    }

    /**
     * 设置
     * @param userName
     */
    public void setUserName(System userName) {
        this.userName = userName;
    }

    /**
     * 获取
     * @return password
     */
    public System getPassword() {
        return password;
    }

    /**
     * 设置
     * @param password
     */
    public void setPassword(System password) {
        this.password = password;
    }

    /**
     * 获取
     * @return path
     */
    public String getPath() {
        return path;
    }

    /**
     * 设置
     * @param path
     */
    public void setPath(String path) {
        this.path = path;
    }

    public String toString() {
        return "User{id = " + id + ", userName = " + userName + ", password = " + password + ", path = " + path + "}";
    }
}
