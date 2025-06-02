import java.util.HashSet;
import java.util.Set;

public static boolean isHappyNumber(int n){
        Set<Integer> seen = new HashSet<>();
        while (!seen.contains(n)){
            seen.add(n);
            int sum = 0;
            while (n!=0){
                int tmp = n%10;
                System.out.println(tmp);
                sum += tmp * tmp;
                n = n/10;
            }
            n = sum;
        }
        return n == 1;
    }
