package adapterMode.classAdapterMode;

import adapterMode.Source;
import adapterMode.Targetable;

/**
 * Created by LinYuQiang on 2018/1/18 0018.
 */
public class Adapter extends Source implements Targetable {

    @Override
    public void method1() {
        super.method1();
    }

    @Override
    public void method2() {
        System.out.println("This is targetable method!");
    }
}
