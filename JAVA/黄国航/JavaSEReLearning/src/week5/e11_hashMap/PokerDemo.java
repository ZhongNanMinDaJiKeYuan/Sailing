package week5.e11_hashMap;

import com.sun.java.swing.plaf.windows.WindowsTextAreaUI;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeSet;

/**
 * 需求：
 * 通过程序实现斗地主过程中的洗牌，发牌和看牌。要求：对牌进行排序
 *
 * 思路：
 *
 * 1:创建 HashMap,键是编号，值是牌
 * 2:创建 ArrayList,存储编号
 * 3:创建花色数组和点数数组
 * 4:从0开始往 HashMap 里面存储编号，并存储对应的牌。同时往 ArrayList 里面存储编号
 * 5:洗牌（洗的是编号）,用 Collections 的 shuffle()方法实现
 * 6:发牌（发的也是编号，为了保证编号是排序的，创建 TreeSet 集合接收）
 * 7:定义方法看牌（遍历 TreeSet 集合，获取编号，到 HashMap 集合找对应的牌）
 * 8:调用看牌方法
 */
public class PokerDemo {
    public static void main(String[] args) {
        HashMap<Integer, String> hm = new HashMap<>();
        ArrayList<Integer> array = new ArrayList<>();

        String[] colors = {"♦","♣", "♥", "♠"};
        String[] numbers = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A","2"};
        int index = 0;
        for (String number: numbers){
            for (String color:colors){
                hm.put(index, color+number);
                array.add(index);
                index++;
            }
        }
        hm.put(index, "小王");
        array.add(index);
        index++;
        hm.put(index, "大王");
        array.add(index);

        // 洗牌
        Collections.shuffle(array);

        // 发牌
        TreeSet<Integer> u1Set = new TreeSet<>();
        TreeSet<Integer> u2Set = new TreeSet<>();
        TreeSet<Integer> u3Set = new TreeSet<>();
        TreeSet<Integer> dpSet = new TreeSet<>();

        for (int i = 0; i < array.size(); i++){
            Integer x = array.get(i);
            if (i >= array.size()-3){
                dpSet.add(x);
            }else if (i % 3 == 0){
                u1Set.add(x);
            }else if (i % 3 == 1){
                u2Set.add(x);
            }else if (i % 3 == 2){
                u3Set.add(x);
            }
        }
        // 调用方法看牌
        lookPoker("玩家1", u1Set,hm);
        lookPoker("玩家2", u2Set,hm);
        lookPoker("玩家3", u3Set,hm);
        lookPoker("底牌", dpSet,hm);
    }
    // 定义方法看牌
    public static void lookPoker(String name, TreeSet<Integer> ts, HashMap<Integer, String> hm){
        System.out.println(name+ "的牌是：");
        for (Integer key : ts){
            String poker = hm.get(key);
            System.out.print(poker + " ");
        }
        System.out.println();
    }
}
