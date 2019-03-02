import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] w = new int[10];
        int[] k = new int[10];
        for (int i = 0; i < 10; ++i) {
            w[i] = Integer.parseInt(br.readLine());
        }
        for (int i = 0; i < 10; ++i) {
            k[i] = Integer.parseInt(br.readLine());
        }
        br.close();
        Arrays.sort(w);
        Arrays.sort(k);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(String.valueOf(w[7]+w[8]+w[9]));
        bw.write(" ");
        bw.write(String.valueOf(k[7]+k[8]+k[9]));
        bw.close();
    }
}
