import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;
        int[] t = new int[10];
        for (int i = 0; i < 10; ++i) {
            t[i] = Integer.parseInt(br.readLine());
        }
        br.close();
        for (int i = 0; i < 10; ++i) {
            if (100-sum >= sum+t[i]-100) {
                sum += t[i];
            } else {
                break;
            }
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(String.valueOf(sum));
        bw.close();
    }
}
