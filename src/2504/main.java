import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String test;
        Scanner scanner = new Scanner(System.in);
        Map<Integer, Character> map = new HashMap<>();
        Map<Integer, Integer> result = new HashMap<>();
        int key = 0;
        test= scanner.next();
        boolean isPlus = false;
        result.put(0,0);
        try {
            for (char ch : test.toCharArray()) {
                if (ch == '(') {
                    ++key;
                    map.put(key, ch);
                    result.put(key, 0);
                    isPlus = true;
                } else if (ch == '[') {
                    ++key;
                    map.put(key, ch);
                    result.put(key, 0);
                    isPlus = true;
                } else if (ch == ')') {
                    if ('(' != map.get(key)) {
                        System.out.println(0);
                        return;
                    }
                    --key;
                    if (isPlus) {
                        result.put(key, result.get(key + 1) + 2 + result.get(key));
                    } else {
                        result.put(key, result.get(key + 1) * 2 + result.get(key));
                    }

                    isPlus = false;
                } else if (ch == ']') {

                    if ('[' != map.get(key)) {
                        System.out.println(0);
                        return;
                    }
                    --key;
                    if (isPlus) {
                        result.put(key, result.get(key + 1) + 3 + result.get(key));
                    } else {
                        result.put(key, result.get(key + 1) * 3 + result.get(key));
                    }

                    isPlus = false;
                } else {
                    System.out.println(0);
                    return;
                }
            }
        } catch (NullPointerException e){
            System.out.println(0);
            return;
        }
        System.out.println(result.get(0));
    }
}
