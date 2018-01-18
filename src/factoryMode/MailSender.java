package factoryMode;

/**
 * Created by LinYuQiang on 2018/1/12 0012.
 */
public class MailSender implements Sender {
    @Override
    public void send() {
        System.out.println("This is mailSender!");
    }
}
