package week4.e1_father_and_son;

public class Test {
    public static void main(String[] args) {
        Son son = new Son();
        son.smoke();
        son.sing();
        System.out.println(son.test);

        // 可以多层继承，并调用父类的父类的方法
    }
}
