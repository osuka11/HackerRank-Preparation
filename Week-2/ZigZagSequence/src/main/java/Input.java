import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;
public class Input {

    public static void main(String[] args) throws java.lang.Exception {
        Scanner kb = new Scanner(System.in);
        int test_cases = kb.nextInt();
        for (int cs = 1; cs <= test_cases; cs++) {
            int n = kb.nextInt();
            int a[] = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = kb.nextInt();
            }
            ZigZagSequence.findZigZagSequence(a, n);
        }
    }
}
