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

class Result {
    public static void miniMaxSum(List<Integer> arr)
    {
                Collections.sort(arr);

        long sum = 0;
        int cont = 0;

        Collections.sort(arr);

        for (int elemento : arr)
        {
            if(cont < 4)
            {
                sum += elemento;
                cont++;
            }
        }

        System.out.printf("%d ", sum);

        cont = 0;
        sum = 0;

        Collections.reverse(arr);

        for (int elemento : arr)
        {
            if(cont < 4)
            {
                sum += elemento;
                cont++;
            }
        }
        System.out.printf("%d\n", sum);
    }
}
public class test {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        Result.miniMaxSum(arr);

        bufferedReader.close();
    }
}

