package builderMode;

/**
 * Created by LinYuQiang on 2018/1/18 0018.
 */
public class TestBuilderMain {

    public static void main(String[] args) {
        Builder builder = new Builder();
        builder.produceMailSender(10);
    }
}
