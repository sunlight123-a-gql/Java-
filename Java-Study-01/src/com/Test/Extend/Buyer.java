package com.Test.Extend;

/**
 * ClassName Buyer
 *
 * @Date2025/2/2814:35
 * @Create bysunlight
 */
public class Buyer extends AdminStaff{

    public  Buyer(){}
    public Buyer(String id, String name, String workName) {
        super(id, name, workName);
    }

    @Override
    public void work() {
        System.out.println("负责采购方面工作");
    }
}
