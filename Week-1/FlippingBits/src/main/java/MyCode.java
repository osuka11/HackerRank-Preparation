import kotlin.UInt;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;
public class MyCode {


    public static long flippingBits(long n) {
        return ( ( (long)Math.pow(2,32) ) - 1 - n);
    }
}
