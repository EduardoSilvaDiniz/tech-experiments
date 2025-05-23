import java.util.HashMap;

public class RomanToInt {
 public static int romanToInt(String s) {
        //TODO usar API lambda para simplificar o codigo
        if (s.isEmpty())
            throw new IllegalArgumentException("String nula");

        String roman = "IVXLCDM";
        int equals = 0;

        for (char c : s.toCharArray())
        {
            for (char r : roman.toCharArray())
            {
                if(c == r)
                    equals++;
            }
        }

        if (!(equals == s.length()))
            throw new IllegalArgumentException("String não contem numeros romando ou contem chars que não são numeros romanos");

        final HashMap<Character,Integer> map = new HashMap<Character, Integer>();
        int result = 0;
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        for (int i = 0; i < s.length(); i++)
        {
            if (i+1 < s.length() && map.get(s.charAt(i)) < map.get(s.charAt(i+1))) {
                result -= map.get(s.charAt(i));
            } else {
                result += map.get(s.charAt(i));
            }
        }
        return result;
    }
}
