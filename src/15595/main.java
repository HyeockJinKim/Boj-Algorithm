import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> winners = new HashMap<>();
        int n = scanner.nextInt();
        int max = 0;
        int success = 0;
        String inputs = scanner.nextLine();
        for (int i = 0; i < n; ++i) {
            inputs = scanner.nextLine();
            final String[] splits = inputs.split(" ");
            if ("megalusion".equals(splits[1])) {
                continue;
            }
            if ("4".equals(splits[2])) {
                if (winners.getOrDefault(splits[1], Integer.MAX_VALUE) > 0) {
                    ++success;
                    ++max;
                    max += winners.getOrDefault(splits[1], 0);
                    winners.put(splits[1], 0);
                }
            } else if (winners.getOrDefault(splits[1], 1) > 0) {
                winners.put(splits[1], winners.getOrDefault(splits[1], 0)+1);
            }
        }
        if (max != 0)
            System.out.println(100.0 * success/max);
        else
            System.out.println(0);
    }
}
