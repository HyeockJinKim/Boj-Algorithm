import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        br.close();
        for (int i = n; i >= 4; --i) {
            int t = i % 10;
            if (t != 4 && t != 7)
                continue;
            t = i;
            boolean isCheck = false;
            while (t > 0) {
                if (t % 10 != 4 && t % 10 != 7) {
                    isCheck = true;
                    break;
                }
                t /= 10;
            }
            if (isCheck)
                continue;
            bw.write(String.valueOf(i));
            bw.close();
            return;
        }
    }
}
