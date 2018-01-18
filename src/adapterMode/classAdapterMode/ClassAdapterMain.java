package adapterMode.classAdapterMode;

import adapterMode.Targetable;

/**
 * Created by LinYuQiang on 2018/1/18 0018.
 */
public class ClassAdapterMain {

    public static void main(String[] args) {
        Targetable target = new Adapter();
        target.method1();
        target.method2();
    }
}
