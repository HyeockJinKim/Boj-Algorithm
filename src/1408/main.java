import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] cur = new int[3];
        int[] tar = new int[3];
        String[] t = br.readLine().split(":");
        for (int i = 0; i < 3; ++i) {
            cur[i] = Integer.parseInt(t[i]);
        }
        t = br.readLine().split(":");
        for (int i = 0; i < 3; ++i) {
            tar[i] = Integer.parseInt(t[i]);
        }
        br.close();
        if (tar[2] < cur[2]) {
            ++cur[1];
            tar[2] += 60;
        }
        tar[2] -= cur[2];
        if (tar[1] < cur[1]) {
            ++cur[0];
            tar[1] += 60;
        }
        tar[1] -= cur[1];
        if (tar[0] < cur[0]) {
            tar[0] += 24;
        }
        tar[0] -= cur[0];
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        if (tar[0] < 10) {
            bw.write("0");
        }
        bw.write(String.valueOf(tar[0]));
        bw.write(":");
        if (tar[1] < 10) {
            bw.write("0");
        }
        bw.write(String.valueOf(tar[1]));
        bw.write(":");
        if (tar[2] < 10) {
            bw.write("0");
        }
        bw.write(String.valueOf(tar[2]));
        bw.close();
    }
}
