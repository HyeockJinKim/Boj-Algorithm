import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] stack = new int[n+1];
        int s = 1, c = 1;
        int[] num = new int[n+1];
        for (int i = 1; i <= n; ++i) {
            num[i] = Integer.parseInt(br.readLine());
        }
        br.close();
        StringBuilder sb = new StringBuilder();
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i = 1; i <= n; ++i) {
            if (num[i] == stack[s-1]) {
                sb.append("-\n");
                --s;
            } else if (num[i] >= i) {
                int t = num[i];
                for (; c <= t; ++c) {
                    stack[s++] = c;
                    sb.append("+\n");
                }
                sb.append("-\n");
                --s;
            } else {
                bw.write("NO");
                bw.close();
                return ;
            }
        }
        bw.write(sb.toString());
        bw.close();
    }
}
