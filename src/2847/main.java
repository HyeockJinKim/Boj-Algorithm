import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] num = new int[n];
        for (int i = 0; i < n; ++i) {
            num[i] = Integer.parseInt(br.readLine());
        }
        br.close();
        int count = 0;
        for (int i = n-2; i >= 0; --i) {
            if (num[i] >= num[i+1]) {
                count += num[i]-num[i+1]+1;
                num[i] = num[i+1]-1;
            }
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(String.valueOf(count));
        bw.close();
    }
}
