package singletonMode;

/**
 * Created by LinYuQiang on 2018/1/12 0012.
 * 饿汉
 */
public class Singleton2 {
    private static Singleton2 instance = new Singleton2();

    private Singleton2() {
    }

    private static Singleton2 getInstance() {
        return instance;
    }
}
