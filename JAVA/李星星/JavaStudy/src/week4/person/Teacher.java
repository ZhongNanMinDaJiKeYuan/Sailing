package week4.person;

public class Teacher extends  Person {
    public Teacher(){}
    public Teacher(String name,int age){
        //this.name = name;
        super(name,age);
    }
    public void teach(){
        System.out.println("成就每一位学员");
    }
}
