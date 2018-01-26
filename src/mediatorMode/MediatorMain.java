package mediatorMode;

/**
 * Created by LinYuQiang on 2018/1/24 0024.
 */
public class MediatorMain {

    public static void main(String[] args) {
        Mediator mediator = new MyMediator();
        mediator.createMediator();
        mediator.workAll();
    }
}
