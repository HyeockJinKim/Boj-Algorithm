import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int f = Integer.parseInt(br.readLine());
        br.close();
        n = n / 100;
        n *= 100;
        int result = 0;
        for (int i = 0; i < 100; ++i) {
            if ((n +i) % f == 0) {
                result = i;
                break;
            }
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        if (result < 10) {
            bw.write("0");
        }
        bw.write(String.format("%d", result));
        bw.newLine();
        bw.close();
    }
}
