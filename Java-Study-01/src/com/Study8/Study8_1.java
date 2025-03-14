package com.Study8;

/**
 * ClassName Study8_1
 *
 * @Date2025/3/314:18
 * @Create bysunlight
 */
public class Study8_1 {

    public static void main(String[] args) {
        //System.out.println(isPrime(9));
        //pow();
        arrayCopy();
    }

    //判断一个数是否是质数：只需要判断平方根左边的数，是否可以就行了
    public static boolean isPrime(int number)
    {
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0)
            {
                return false;
            }
        }
        return true;
    }

    public static void pow()
    {
        int count = 0;
        for (int i = 1000; i <= 9999 ; i++)
        {
            int ge = i % 10;
            int shi = i /10 %10;
            int bai = i/10/10%10;
            int qian = i/10/10/10;
            //System.out.println( ge +  " " +shi + " " +bai + " " + i);
            if (Math.pow(ge,4) + Math.pow(shi,4) + Math.pow(bai,4) + Math.pow(qian,4) == i)
            {
                count++;
                System.out.println(i);
            }
        }
        System.out.println(count);
    }

    public static void arrayCopy()
    {
        int[] arr ={1,2,3,4,5,6,7,8,9,10};
        int[] arr2 = new int[10];
        /**
         * 参数一：数据源
         * 参数二：从数据源的第几个索引开始拷贝
         * 参数三：目的地
         * 参数四：目的地数组的索引
         * 参数五：拷贝的个数
         */
        System.arraycopy(arr,0,arr2,4,3);
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + "\t");
        }
        System.out.println();
        System.exit(0);
    }

    public static void equal()
    {
        String s = "abc";
        StringBuilder sb = new StringBuilder("abc");

        System.out.println(s.equals(sb));
        /**
         * 因为equals方法是被s调用的，而s是字符串
         * 所以equals要看string类中的
         * 字符串中的equals方法，先判断参数是否是字符串
         * 如果是字符串，再比较内部的属性
         * 如果不是，直接返回false
         */
        System.out.println(sb.equals(s));
        /**
         * 因为equals是sb调用的，而sb是stringBuilder
         * 所以这里equals方法要看StringBuilder内部的equals方法
         * 但在StringBuilder当中，没有重写equals方法，
         * 所以调用的是Object当中的equals
         * 在Object当中，默认是使用==号来比较两个对象的地址值
         * 而这里的s和sb记录的地址值是不一样的，所以是false。
         */
    }

}
