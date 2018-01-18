package builderMode;

import factoryMode.MailSender;
import factoryMode.Sender;
import factoryMode.SmsSender;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by LinYuQiang on 2018/1/18 0018.
 */
public class Builder {

    private List<Sender> list = new ArrayList<>();

    public void produceMailSender(int count) {
        for (int i = 0; i < count; i++) {
            list.add(new MailSender());
        }
    }

    private void produceSmsSender(int count) {
        for (int i = 0; i < count; i++) {
            list.add(new SmsSender());
        }
    }
}
