import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> a = new PriorityQueue<>();
        PriorityQueue<Integer> b = new PriorityQueue<>(1, Collections.reverseOrder());

        String[] lines = br.readLine().split(" ");
        for (int i = 0; i < n; ++i) {
            a.add(Integer.parseInt(lines[i]));
        }
        lines = br.readLine().split(" ");
        for (int i = 0; i < n; ++i) {
            b.add(Integer.parseInt(lines[i]));
        }
        int result = 0;
        for (int i = 0; i < n; ++i) {
            result += a.poll() * b.poll();
        }
        System.out.println(result);
    }
}
