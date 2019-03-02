import java.io.*;

public class Main {
    private static boolean[] isCheck;
    private static int n;
    private static int[] t;
    private static StringBuilder t2;
    private static int index = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        br.close();
        isCheck = new boolean[n+1];
        t = new int[n+1];
        t2 = new StringBuilder();
        p(1);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(t2.toString());
        bw.close();
    }

    private static void p(int size) {
        if (size > n) {
            StringBuilder sb = new StringBuilder();
            for (int i = 1; i < n; ++i) {
                sb.append(t[i]).append(" ");
            }
            sb.append(t[n]).append("\n");
            t2.append(sb.toString());
            return ;
        }
        for (int i = 1; i <= n; ++i) {
            if (!isCheck[i]) {
                isCheck[i] = true;
                t[size] = i;
                p(size+1);
                isCheck[i] = false;
            }
        }
    }
}
