package singletonMode;

/**
 * Created by LinYuQiang on 2018/1/12 0012.
 * 静态内部类
 */
public class Singleton3 {
    private static class SingletonHolder {
        private static final Singleton3 INSTANCE = new Singleton3();
    }

    private Singleton3() {
    }

    public static final Singleton3 getInstance() {
        return SingletonHolder.INSTANCE;
    }
}
