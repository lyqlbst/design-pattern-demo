package observerMode;

/**
 * Created by LinYuQiang on 2018/1/19 0019.
 */
public class ObserverMain {

    public static void main(String[] args) {
        Subject sub = new MySubject();
        sub.add(new Observer1());
        sub.add(new Observer2());

        sub.operation();
    }
}
