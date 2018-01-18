package factoryMode;

/**
 * Created by LinYuQiang on 2018/1/12 0012.
 */
public class SendMailFactory implements Provider {
    @Override
    public Sender produce() {
        return new SmsSender();
    }
}
