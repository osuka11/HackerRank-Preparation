import java.util.ArrayList;
import java.util.List;

public class MyCode {

    public static void plusMinus(List<Integer> arr) {
        float positives = ((float) arr.stream().filter(v -> v >= 0 && v <= 100).count());
        float negatives = ((float) arr.stream().filter(v -> v <= 0 && v >= -100).count());
        float zeros = ((float) arr.stream().filter(v -> v == 0).count());


        System.out.printf("%.6f",positives/arr.size());
        System.out.println();
        System.out.printf("%.6f",negatives/arr.size());
        System.out.println();
        System.out.printf("%.6f",zeros/arr.size());
    }
}
