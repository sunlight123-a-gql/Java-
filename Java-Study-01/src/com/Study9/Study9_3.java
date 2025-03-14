package com.Study9;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * ClassName Study9_3
 *
 * @Date2025/3/612:36
 * @Create bysunlight
 */
public class Study9_3 {

    /**
     * 集合：
     *
     * 迭代器遍历：不依赖索引的
     *      迭代器在java中的类是Iterator，迭代器是集合专用的遍历方式
     *
     *      注意细节：
     *          1.迭代器遍历完成，指针不会复位，如果需要重新遍历，需要重新创建一个迭代器对象
     *          2.循环中只能用一次next方法
     *          3.迭代器遍历时，不能用集合的方法进行增加或者删除，如果需要再迭代过程中进行删除的话，需要调用iterator.remove()方法。
     *
     *
     * 增强for遍历：它提供了一种更简洁、更易读的方式来遍历数组或实现了 java.lang.Iterable 接口的集合类中的元素。
     *  for(数据类型 : 变量名 : 集合、数组)
     *  {
     *     当使用增强 for 循环遍历基本数据类型数组时，每次迭代中获取到的元素实际上是数组中元素的一个副本。对这个副本进行修改，不会影响到原数组中的元素
     *  }
     * 本质上还是迭代器遍历的过程，不依赖索引，直接访问元素
     *      所有的单例集合和数组才能用增强for进行遍历
     * 优点
     *      简洁性：代码更加简洁，减少了传统 for 循环中索引变量的使用，提高了代码的可读性。
     *      安全性：避免了因索引越界等问题导致的错误，因为它会自动处理元素的遍历。
     * 局限性
     *      无法获取索引：增强 for 循环只能访问元素，不能直接获取元素的索引。如果需要使用索引，还是需要使用传统的 for 循环。
     *      不能修改集合结构：在增强 for 循环中不能对集合进行增删操作，否则会抛出 ConcurrentModificationException 异常。如果需要修改集合结构，可使用迭代器。
     *
     *
     * 单列集合：
     *  Collection:
     *      List:添加的元素有序（存取的顺序是一样的）、可重复（集合中存储的元素是可重复的）、有索引
     *          ArrayList：
     *          LinkedList：
     *      Set：添加的元素是无序的（存取的方式可能是无序的）、不可重复的（元素是不可重复的）、无索引的
     *          HashSet：无序、不重复、无索引                                                    (对集合中的元素进行去重，一般情况下使用HashSet)
     *          LinkedHashSet：有序、不重复、无索引                                              (对集合中的元素进行去重，而且保证存取的顺序)
     *          TreeSet：可排序、不重复、无索引  底层是基于红黑树的数据结构实现排序的，增删改查性能都较好   (对集合中的元素进行排序)
     *
     *
     *          TreeSet两种比较方式：
     *              1.默认排序：javaBean类实现Comparable接口指定比较规则
     *              2.比较器排序：创建TreeSet对象的时候，传递比较器Comparator指定规则
     *
     * 双列集合：
     *      Map是双列集合的顶层接口，它的功能是全部双列集合都可以继承使用的
     *
     *
     *      HashMap:所有的特点都是针对键，由键决定的，无序、不重复、无索引
     *
     *      源码解析：
     *          1.如果当前是第一次添加数据，底层会创建一个默认长度为16的，加载因子为0.75的数组
     *          2.如果不是第一次添加数据，会看数组中的元素是否达到了扩容的条件
     *          3.如果没有达到条件，底层不会做任何操作
     *          4.如果达到了扩容条件，底层会把数组扩容为原先的两倍，并把数据全部转移到新的哈希表中去
     *
     *      LinkedHashMap:
     *          由键决定：
     *          特点：有序（保证存储和取出的元素顺序一致）、不重复、无索引
     *          原理：底层数据结构是哈希表，只有每个键值对元素又额外多了一个双链表的机制记录存储的顺序
     *
     *      TreeMap:
     *          可排序：对键进行排序（默认按照键的大小进行排序，也可以按照自己规定的键进行排序规则）
     *          排序规则：
     *              1.实现Comparable接口，指定比较规则
     *              2.创建集合时传递Comparator比较器对象，指定比较规则
     *
     *
     *  HashMap(默认效率最高)
     *  LinkedHashMap：（保证存取有序）
     *  TreeMap：（排序）
     *
     */

    public static void main(String[] args) {
        Collection<String> coll = new ArrayList<>();
        coll.add("aaa");
        coll.add("aaa1");
        coll.add("aaa2");
        coll.add("aaa3");

        //获取迭代器对象
        //迭代器 ，默认指向集合的0索引处
        Iterator<String> iterator = coll.iterator();
        //利用循环不断地去获取集合中的每一个元素
        while (iterator.hasNext())
        {
            //next方法的两件事情：获取元素并移动指针
            String a = iterator.next();
            //System.out.println(a);
        }

        Map<String,String> map = new HashMap<>();
        map.put("杨过","小龙女");
        map.put("杨过1","小龙女1");
        map.put("杨过2","小龙女2");
        map.put("杨过3","小龙女3");

        /*Set<String> strings = map.keySet();     //ctrl + alt+ v：自动补齐左边的返回值

        Iterator<String> iterator1 = strings.iterator();
        while (iterator1.hasNext())
        {
            String a = iterator1.next();
            System.out.println(a);
        }


        for (String string : strings) {
            System.out.println(string);
        }

        strings.forEach(s -> System.out.println(s));*/


        Set<Map.Entry<String, String>> entries = map.entrySet();
        Iterator<Map.Entry<String,String>> entryIterator = entries.iterator();
        while (entryIterator.hasNext())
        {
            Map.Entry<String, String> next = entryIterator.next();
            String key = next.getKey();
            String value = next.getValue();
            System.out.println(key + "=" + value);
        }

        for (Map.Entry<String, String> entry : entries) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + "=" + value);
        }

        entries.forEach(stringStringEntry -> System.out.println(stringStringEntry.getKey() + "=" + stringStringEntry.getValue()));


    }
}
