package decoratorMode;

/**
 * Created by LinYuQiang on 2018/1/18 0018.
 */
public class Source implements Sourceable {

    @Override
    public void method() {
        System.out.println("the original method!");
    }
}
