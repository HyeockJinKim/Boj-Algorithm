import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int max = 0, index = 0;
        for (int i = 1; i <= 9; ++i) {
            int t = Integer.parseInt(br.readLine());
            if (max < t) {
                max = t;
                index = i;
            }
        }
        br.close();
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(String.valueOf(max));
        bw.newLine();
        bw.write(String.valueOf(index));
        bw.close();
    }
}
