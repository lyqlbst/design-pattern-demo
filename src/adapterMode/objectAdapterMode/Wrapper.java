package adapterMode.objectAdapterMode;

import adapterMode.Source;
import adapterMode.Targetable;

/**
 * Created by LinYuQiang on 2018/1/18 0018.
 */
public class Wrapper implements Targetable {

    private Source source;

    public Wrapper(Source source) {
        super();
        this.source = source;
    }

    @Override
    public void method1() {
        source.method1();
    }

    @Override
    public void method2() {
        System.out.println("This is the targetable method!");
    }
}
