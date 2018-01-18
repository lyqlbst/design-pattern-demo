package adapterMode.interfaceAdapterMode;

/**
 * Created by LinYuQiang on 2018/1/18 0018.
 */
public class InterfaceAdapterMain {

    public static void main(String[] args) {
        Sourceable source1 = new SourceSub1();
        Sourceable source2 = new SourceSub2();
        source1.method1();
        source1.method2();
        source2.method1();
        source2.method2();
    }
}
