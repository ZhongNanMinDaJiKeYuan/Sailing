package com.Arraylist;
/*集合，存储多个数据
public ArrayList() ；创建一个空的集合对象
public boolean add(E e) 将指定的元素追加到此集合的末尾
public void add(int index,E element) 在此集合中的指定位置插入指定的元素
public boolean remove(Object o) 删除指定元素，返回删除是否成功
public E remove(int index) 删除指定索引处的元素，返回被删除的元素
public E set(int index, E element)修改指定索引处的元素，返回被修改的元素
public E get(int index)返回指定索引处的元素
public int size()返回集合中的元素个数
 */


import java.util.ArrayList;

public class Test01 {
    public static void main(String[] args) {
        //<>内为存储数据的类型
        ArrayList<String> array = new ArrayList<String>();

        //添加元素
        array.add("hello");
        array.add(1,"java");
        array.add("zhuawa");
        //遍历集合
        for(int i=0; i<array.size(); i++) {
            String s = array.get(i);
            System.out.println(s);
        }


    }
}
