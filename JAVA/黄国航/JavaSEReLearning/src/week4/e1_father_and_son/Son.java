package week4.e1_father_and_son;

public class Son extends Father{
    public void sing(){
        // 访问到爷爷的变量
        System.out.println("Singing..."+super.test);
    }
}
