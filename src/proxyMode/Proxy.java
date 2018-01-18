package proxyMode;

/**
 * Created by LinYuQiang on 2018/1/18 0018.
 */
public class Proxy implements Sourceable {

    private Source source;

    public Proxy() {
        super();
        this.source = new Source();
    }

    @Override
    public void method() {
        before();
        source.method();
        after();
    }

    private void before() {
        System.out.println("before proxy!");
    }

    private void after() {
        System.out.println("after proxy!");
    }
}
