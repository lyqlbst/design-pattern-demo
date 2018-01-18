package proxyMode;

/**
 * Created by LinYuQiang on 2018/1/18 0018.
 */
public class ProxyMain {

    public static void main(String[] args) {
        Sourceable source = new Proxy();
        source.method();
    }
}
