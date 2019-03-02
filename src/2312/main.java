import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        int[] n = new int[t];
        for (int i = 0; i < t; ++i) {
            n[i] = Integer.parseInt(br.readLine());
        }
        br.close();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < t; ++i) {
            int j = 2;
            while (n[i] > 1) {
                int count = 0;
                while (n[i] % j == 0) {
                    n[i] /= j;
                    ++count;
                }
                if (count != 0)
                    sb.append(j).append(" ").append(count).append("\n");
                ++j;
            }
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(sb.toString());
        bw.close();
    }
}
