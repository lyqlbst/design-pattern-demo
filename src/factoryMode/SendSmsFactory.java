package factoryMode;

/**
 * Created by LinYuQiang on 2018/1/12 0012.
 */
public class SendSmsFactory implements Provider {
    @Override
    public Sender produce() {
        return new SmsSender();
    }
}
