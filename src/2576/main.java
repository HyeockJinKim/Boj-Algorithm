import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int min = 100;
        int sum = 0;
        for (int i = 0; i < 7; ++i) {
            int t = Integer.parseInt(br.readLine());
            if ((t & 1) == 1) {
                min = min <= t ? min : t;
                sum += t;
            }
        }
        br.close();
        if (min == 100) {
            bw.write("-1");
            bw.close();
            return;
        }

        bw.write(String.valueOf(sum));
        bw.newLine();
        bw.write(String.valueOf(min));
        bw.close();
    }
}
