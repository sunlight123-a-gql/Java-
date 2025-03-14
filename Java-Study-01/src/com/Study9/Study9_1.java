package com.Study9;

/**
 * ClassName Study9_1
 *
 * @Date2025/3/61:12
 * @Create bysunlight
 */
public class Study9_1 {

    /**
     * 排序算法：
     *      冒泡排序：
     *          相邻的数据两两比较，小的在前面，大的在后面
     *
     *      选择排序：
     *          从0索引开始，拿着每一个索引上的元素跟后面的元素依次比较，小的放前面，大的放后面，以此类推
     *
     *      插入排序：
     *          将0索引的元素到N索引的元素看做是有序的，把N+1索引的元素到最后一个当成是无序的，遍历无序的数据，将遍历到的元素插入有序序列中适当的位置，如遇到相同数据，插在后面，N的范围：0~最大索引
     *
     *      快速排序：
     *          第一轮：把0索引的数字作为基准数，确定基准数在数组中正确的位置，比基准数小的全部在左边，比基准数大的数全部在右边
     *      递归算法：方法自己调用自己
     *             注意：递归一定要有出口，否则就会出现内存溢出
     */


    /**
     * 选择排序
     * @param arr
     */
    public static void SelectSort(int[] arr)
    {
        boolean flag = false;
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] > arr[j])
                {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    flag = true;
                }
            }
            if (!flag)
            {
                return;
            }
        }
    }


    /**
     * 冒泡排序
     * @param arr
     */
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // 交换 arr[j] 和 arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            // 如果没有发生交换，说明数组已经有序
            if (!swapped) {
                break;
            }
        }
    }

    /**
     * 插入排序
     */
    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            // 取出当前要插入的元素
            int key = arr[i];
            int j = i - 1;

            // 将比 key 大的元素向后移动
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            // 插入 key 到合适的位置
            arr[j + 1] = key;
        }
    }


    /**
     * 快速排序:
     *      三个参数：
     *          第一个参数：要排序的数组
     *          第二个参数：要排序数组的起始索引
     *          第三个索引：要排序数组的结束索引
     */
    public static void QuickSort(int[] arr,int i,int j)
    {
        //定义两个变量记录要查找的范围
        int start = i;
        int end = j;

        //记录基准数
        int baseNumber = arr[i];

        while (start != end)
        {
           //利用end 从后往前开始找，找比基准数小的数字
            while (true)
            {
                if (end <= start || arr[end] < baseNumber)
                {
                    break;
                }
                end--;
            }
           //利用start，从前往后找，找比基准数大的数字
            while (true)
            {
                if (end <= start || arr[end] > baseNumber)
                {
                    break;
                }
                start++;
            }
           //把end和start指向的元素进行交换
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
        }

        //当start和end指向同一个元素时候，结束上面的循环
        int temp  = arr[i];
        arr[i] = arr[start];
        arr[start] = temp;
    }

    /**
     * 大事化小，小事化了。
     * @param n
     * @return
     */
    public static int f(int n)
    {
        if (n == 1)
        {
           return 1;
        }
        return n + f((n-1));
    }

    public static int f1(int n)
    {
        if (n == 1)
        {
            return 1;
        }
        return n * f1(n-1);
    }


    public static void main(String[] args) {
        System.out.println(f1(4));
    }

}
