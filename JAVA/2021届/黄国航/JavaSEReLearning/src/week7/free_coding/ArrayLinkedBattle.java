package week7.free_coding;

import week5.e11_hashMap.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ThreadLocalRandom;

/**
 * 通常说：
 *      数组的随机访问快，插入和删除慢
 *      链表的插入删除快，随机访问慢
 *      频繁增删的情况下，用链表比较合适
 *      在随机查找多的情况下，用数组比较合适
 * 但是：也不一定：https://mp.weixin.qq.com/s/KuJcWOlcCS2YfyKcBMePnw
 * 具体的原因？
 */
public class ArrayLinkedBattle {
    private static final int COUNT = 100000;


    public static void main(String[] args) {


        System.out.println("首位插入：");
        addAtFirst(fillList(new ArrayList<>(COUNT)), "ArrayList");
        addAtFirst(fillList(new LinkedTestList<>()), "LinkedTestList");

        System.out.println("尾端插入：");
        addAtLast(fillList(new ArrayList<>(COUNT)), "ArrayList");
        addAtLast(fillList(new LinkedTestList<>()), "LinkedTestList");

        System.out.println("中间位置插入：");
        addAtMiddle(fillList(new ArrayList<>(COUNT)), "ArrayList");
        addAtMiddle(fillList(new LinkedTestList<>()), "LinkedTestList");
        System.out.println("寻找Node的时间为：" + LinkedTestList.countFindNode);
        System.out.println(LinkedTestList.maxIndex + " : " + LinkedTestList.minIndex);
        Map<Long,Integer> map = LinkedTestList.map;
        Set<Long> keySet = map.keySet();
        for (Long t : keySet) {
            int value = map.get(t);
            System.out.println(t+" : "+ value);
        }
        System.out.println("ave1:"+LinkedTestList.sum1/map.get((long)1));

        System.out.println("随机插入：");
        randomAdd(fillList(new ArrayList<>(COUNT)), "ArrayList");
        randomAdd(fillList(new LinkedTestList<>()), "LinkedTestList");
        System.out.println("寻找Node的时间为：" + LinkedTestList.countFindNode);
        System.out.println(LinkedTestList.maxIndex + " : " + LinkedTestList.minIndex);
        map = LinkedTestList.map;
        keySet = map.keySet();
        for (Long t : keySet) {
            int value = map.get(t);
            System.out.println(t+" : "+ value);
        }
        System.out.println("ave1:"+LinkedTestList.sum1/map.get((long)1));





//        System.out.println("随机位置访问");
//        randomGet(fillList(new ArrayList<>(COUNT)), "ArrayList");
//        randomGet(fillList(new LinkedTestList<>()), "LinkedTestList");

    }
    // 填满count个数值
    static List<Integer> fillList(List<Integer> list){
        for (int i =0; i < COUNT; i++) {
            list.add(i);
        }
        return list;
    }

    // 随机位置向列表中插入
    static  void randomAdd(List<Integer> list, String listType) {

       long t = 0;
        for (int i = 0; i < COUNT; i++){
            int index = ThreadLocalRandom.current().nextInt(0, COUNT);
            long t1 = System.currentTimeMillis();
            list.add(index, i);
            long t2 = System.currentTimeMillis();
            t += t2 -t1;
        }

        System.out.println(listType+ "随机位置插入"+ COUNT + "次耗时：" + t);

    }

    // 在中间位置插入
    static  void addAtMiddle(List<Integer> list, String listType) {
        long t1 = System.currentTimeMillis();
        for (int i = 0; i < COUNT; i++){
            list.add(list.size()/2-2, i);
        }
        long t2 = System.currentTimeMillis();
        System.out.println(listType+ "中间位置插入"+ COUNT + "次耗时：" + (t2-t1));

    }

    // 在首位置插入
    static  void addAtFirst(List<Integer> list, String listType) {
        long t1 = System.currentTimeMillis();
        for (int i = 0; i < COUNT; i++){
            list.add(0, i);
        }
        long t2 = System.currentTimeMillis();
        System.out.println(listType+ "首位置插入"+ COUNT + "次耗时：" + (t2-t1));
    }

    // 在尾端插入
    static  void addAtLast(List<Integer> list, String listType) {
        long t1 = System.currentTimeMillis();
        for (int i = 0; i < COUNT; i++){
            list.add(i);
        }
        long t2 = System.currentTimeMillis();
        System.out.println(listType+ "尾端插入"+ COUNT + "次耗时：" + (t2-t1));
    }


    // 随机访问
    static void randomGet(List<Integer> list, String listType) {
        long t1 = System.currentTimeMillis();
        for (int i = 0; i < COUNT; i++){
            list.get(ThreadLocalRandom.current().nextInt(0, COUNT));
        }
        long t2 = System.currentTimeMillis();
        System.out.println(listType+ "中间位置插入"+ COUNT + "次耗时：" + (t2-t1));
    }
}
/**
 * COUNT=50000
 * 随机插入：?
 * ArrayList随机位置插入50000次耗时：680
 * LinkedList随机位置插入50000次耗时：8676
 * 首位插入：
 * ArrayList首位置插入50000次耗时：921
 * LinkedList首位置插入50000次耗时：2
 * 尾端插入：
 * ArrayList尾端插入50000次耗时：3
 * LinkedList尾端插入50000次耗时：2
 * 中间位置插入：?
 * ArrayList中间位置插入50000次耗时：410
 * LinkedList中间位置插入50000次耗时：4507
 * 
 * 
 * 
 * 随机位置访问:
 * ArrayList中间位置插入50000次耗时：3
 * LinkedList中间位置插入50000次耗时：1288
 */
/**
 * 中间位置插入：
 * ArrayList中间位置插入50000次耗时：466
 * LinkedTestList中间位置插入50000次耗时：4661
 * 寻找Node的时间为：4652
 * 33740 : 11
 * 随机插入：
 * ArrayList随机位置插入50000次耗时：606
 * LinkedTestList随机位置插入50000次耗时：9011
 * 寻找Node的时间为：9001
 * 41318 : 4
 */
