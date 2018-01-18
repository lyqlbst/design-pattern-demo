package factoryMode;

/**
 * Created by LinYuQiang on 2018/1/12 0012.
 */
public class TestFactoryMain {
    public static void main(String[] args) {
        new SendMailFactory().produce().send();
    }
}
