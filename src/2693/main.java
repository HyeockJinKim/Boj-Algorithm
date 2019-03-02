import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] third = new int[n];
        for (int i = 0; i < n; ++i) {
            String[] line = br.readLine().split(" ");
            PriorityQueue<Integer> priorityQueue = new PriorityQueue<>((o1, o2) -> o1 < o2 ? 1: -1);
            for (int j = 0; j < line.length; ++j) {
                priorityQueue.add(Integer.parseInt(line[j]));
            }
            priorityQueue.poll();
            priorityQueue.poll();
            third[i] = priorityQueue.poll();
        }
        br.close();
        for (int i = 0; i < n; ++i) {
            System.out.println(third[i]);
        }
    }
}
