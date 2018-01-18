package adapterMode.objectAdapterMode;

import adapterMode.Source;
import adapterMode.Targetable;

/**
 * Created by LinYuQiang on 2018/1/18 0018.
 */
public class ObjectAdapterMain {

    public static void main(String[] args) {
        Source source = new Source();
        Targetable target = new Wrapper(source);
        target.method1();
        target.method2();
    }
}
