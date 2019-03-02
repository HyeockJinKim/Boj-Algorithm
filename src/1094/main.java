import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine());
        br.close();
        int len = 64;
        int count = 0;
        while (x > 0) {
            if (len <= x) {
                x -= len;
                ++count;
            }
            len /= 2;
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(String.format("%d", count));
        bw.newLine();
        bw.close();
    }
}
