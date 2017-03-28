import java.util.ArrayList;

/**
 * Created by xuan on 2017/3/28 0028.
 */
public class TestKnown {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(new Integer(2));
        list.add(null);
        System.out.println(list);
    }
}
