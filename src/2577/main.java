import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a, b, c;
        a = Integer.parseInt(br.readLine());
        b = Integer.parseInt(br.readLine());
        c = Integer.parseInt(br.readLine());
        br.close();

        String result = String.format("%d", a*b*c);
        int len = result.length();
        int[] num = new int[10];
        for (int i = 0; i < len; ++i) {
            int t = result.charAt(i)-'0';
            ++num[t];
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i = 0; i < 10; ++i) {
            bw.write(String.format("%d", num[i]));
            bw.newLine();
        }
        bw.close();
    }
}
