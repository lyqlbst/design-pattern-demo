package singletonMode;

/**
 * Created by LinYuQiang on 2018/1/12 0012.
 * 懒汉，线程安全
 */
public class Singleton {
    private static Singleton instance = null;

    private Singleton() {
    }

    public static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
