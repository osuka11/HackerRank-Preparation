import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class MyCode {
    public static int sockMerchant(int n, List<Integer> ar) {
        Set<Integer> arrSet = ar.stream().collect(Collectors.toSet());
        int counter = 0;
        for (int element: arrSet){
            counter += ar.stream().filter( i -> i == element).collect(Collectors.toList()).size()/2;
        }
        return counter;
    }
}
