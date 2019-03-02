import java.io.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] time = new int[n][2];
        for (int i = 0; i < n; ++i) {
            StringTokenizer tokenizer = new StringTokenizer(br.readLine());
            time[i][0] = Integer.parseInt(tokenizer.nextToken());
            time[i][1] = Integer.parseInt(tokenizer.nextToken());
        }
        br.close();
        Arrays.sort(time, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[1] < o2[1]) {
                    return -1;
                } else if (o1[1] > o2[1]) {
                    return 1;
                } else {
                    if (o1[0] < o2[0]) {
                        return -1;
                    } else {
                        return 1;
                    }
                }
            }
        });
        int count = 0;
        int cur = 0;
        for (int i = 0; i < n; ++i) {
            if (cur <= time[i][0]) {
                cur = time[i][1];
                ++count;
            }
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(String.valueOf(count));
        bw.close();
    }
}
