package week4.teacher_student;

public class Teacher {
    private String name;
    private int age;
    public Teacher(){
    }

    public Teacher(String name,int age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void teach(){
        System.out.println("成就每一位学员");
    }
}
