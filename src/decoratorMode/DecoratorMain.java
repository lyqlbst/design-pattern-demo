package decoratorMode;

/**
 * Created by LinYuQiang on 2018/1/18 0018.
 */
public class DecoratorMain {

    public static void main(String[] args) {
        Sourceable source = new Source();
        Sourceable obj = new Decorator(source);
        obj.method();
    }
}
