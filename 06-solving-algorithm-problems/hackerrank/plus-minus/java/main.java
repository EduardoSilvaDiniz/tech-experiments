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

public class test {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String n = bufferedReader.readLine().trim();

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());
        plusMinus(arr);
    }
    public static void plusMinus(List<Integer> arr)
    {
        int maior = 0, menor = 0, zero = 0;
        for (int i = 0; i < arr.size(); i++)
        {
            if (arr.get(i) > 0)
                maior++;
            else if (arr.get(i) < 0)
                menor++;
            else
                zero++;
        }
        System.out.printf("%.6f\n", (double) maior/arr.size());
        System.out.printf("%.6f\n", (double) menor/arr.size());
        System.out.printf("%.6f\n", (double) zero/arr.size());
    }
}

