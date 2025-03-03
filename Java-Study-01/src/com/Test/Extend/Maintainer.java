package com.Test.Extend;

/**
 * ClassName Maintainer
 *
 * @Date2025/2/2814:35
 * @Create bysunlight
 */
public class Maintainer extends AdminStaff{

    public Maintainer() {
    }

    public Maintainer(String id, String name, String workName) {
        super(id, name, workName);
    }

    @Override
    public void work() {
        System.out.println("负责维护工作");
    }
}
