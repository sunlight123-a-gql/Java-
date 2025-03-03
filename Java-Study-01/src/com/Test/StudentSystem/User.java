package com.Test.StudentSystem;

/**
 * ClassName User
 *
 * @Date2025/2/2723:13
 * @Create bysunlight
 */
public class User {


    private String userName;

    private String password;

    private String identify;

    private String phone;


    public User() {
    }

    public User(String userName, String password,String identify,String phone) {
        this.userName = userName;
        this.password = password;
        this.identify = identify;
        this.phone = phone;
    }

    /**
     * 获取
     * @return userName
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 设置
     * @param userName
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * 获取
     * @return password
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }


    /**
     * 获取
     * @return phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 设置
     * @param phone
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * 获取
     * @return identify
     */
    public String getIdentify() {
        return identify;
    }

    /**
     * 设置
     * @param identify
     */
    public void setIdentify(String identify) {
        this.identify = identify;
    }

}
