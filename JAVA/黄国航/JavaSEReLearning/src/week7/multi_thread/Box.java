package week7.multi_thread;

/**
 * 奶箱类
 */
public class Box {
    // 表示第x瓶奶
    private int milk;
    // 奶箱是否有牛奶
    private boolean state = false;

    public synchronized void put(int milk) {
        if (state){// 有奶就先不放奶，等消费者拿了奶箱的奶才能继续放
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        this.milk = milk;
        System.out.println("Milkman put No." + this.milk + " milk into the box");
        // 生产完毕之后，修改奶箱
        state = true;
        // 需要唤醒其他等待的线程
        notifyAll();
    }
    public synchronized void get(){
        if(!state){ // 如果奶箱里没奶，就得等
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("User get the No." + this.milk + "milk");

        // 消费完之后，修改奶箱状态
        state = false;
        // 需要唤醒其他等待的线程
        notifyAll();
    }
}
