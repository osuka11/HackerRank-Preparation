import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class MyCode {
    public static int lonelyinteger(List<Integer> a) {
        int lonely = a.stream().filter(i -> a.stream().filter(it -> it == i).count() == 1).collect(Collectors.toList()).get(0);
        return lonely;
    }
}
