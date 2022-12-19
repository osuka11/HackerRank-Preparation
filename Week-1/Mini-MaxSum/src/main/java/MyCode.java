import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class MyCode {
    public static void miniMaxSum(List<Integer> arr) {
        Collections.sort(arr);
        List<Long> arrLong = arr.stream().map(Integer::longValue).collect(Collectors.toList());
        // arrLong.forEach(System.out::println);
        Long maxSum = (arrLong.stream().reduce(1L, (a,b) -> a+b )) - arrLong.get(0);
        Long minSum = (arrLong.stream().reduce(1L, (a,b) -> a+b )) - arrLong.get(arrLong.size()-1);
        System.out.println(maxSum + " " + minSum);
    }

}

