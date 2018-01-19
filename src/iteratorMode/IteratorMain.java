package iteratorMode;

/**
 * Created by LinYuQiang on 2018/1/19 0019.
 */
public class IteratorMain {

    public static void main(String[] args) {
        Collection collection = new MyCollection();
        Iterator it = collection.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
