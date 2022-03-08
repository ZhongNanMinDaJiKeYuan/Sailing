package Project.Project2;

public class Coach extends Human implements Basketball,English{
    @Override
    public void Eat() {
        System.out.println("篮球教练吃饭");
    }

    @Override
    public void Basketball_() {
        System.out.println("是篮球");
    }

    @Override
    public void SpeakEnglish() {
        System.out.println("会讲英文");
    }
}
