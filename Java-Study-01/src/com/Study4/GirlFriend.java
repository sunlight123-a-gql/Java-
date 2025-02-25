package com.Study4;

/**
 * ClassName GirlFriend
 *
 * @Date2025/2/243:56
 * @Create bysunlight
 */
public class GirlFriend {


        private int age;

        public void setAge(int a)
        {
            if (a >= 18 && a <= 50)
            {
                this.age = a;
            }else {
                System.out.println("非法数据");
            }
        }

        public int getAge()
        {
            return age;
        }

}
