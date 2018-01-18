package singletonMode;

/**
 * Created by LinYuQiang on 2018/1/12 0012.
 * 双重锁
 */
public class Singleton4 {
    private volatile static Singleton4 instance;

    private Singleton4() {
    }

    public static Singleton4 getInstance() {
        if (instance == null) {
            synchronized (Singleton4.class) {
                if (instance == null) {
                    instance = new Singleton4();
                }
            }
        }
        return instance;
    }
}
