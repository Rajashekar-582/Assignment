package corejava;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RomanInteger {
    public static int romanToInt(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }

        Map<Character, Integer> r = new HashMap<>();
        r.put('I', 1);
        r.put('V', 5);
        r.put('X', 10);
        r.put('L', 50);
        r.put('C', 100);
        r.put('D', 500);
        r.put('M', 1000);

        int result = 0;
        int p = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            int c = r.get(s.charAt(i));

            if (c < p) {
                result -= c;
            } else {
                result += c;
            }

            p = c;
        }

        return result;
    }

    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
        String roman =sc.next(); 
        int Value = romanToInt(roman);
        System.out.println("Roman numeral: " + roman);
        System.out.println("Integer value: " + Value);
    }
}
/*output
IX
Roman numeral: IX
Integer value: 9
*/