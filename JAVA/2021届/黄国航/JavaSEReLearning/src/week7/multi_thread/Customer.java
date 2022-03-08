package week7.multi_thread;

public class Customer implements Runnable{
    private Box b;
    public Customer(Box b) {
        this.b =b;
    }

    @Override
    public void run() {
        while (true) {
            b.get();
        }
    }
}
