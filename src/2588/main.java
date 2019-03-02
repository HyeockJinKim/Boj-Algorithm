import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a, b;
        a = Integer.parseInt(br.readLine());
        b = Integer.parseInt(br.readLine());
        br.close();
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int sum = 0, ten = 1;
        while (b > 0) {
            int t = a * (b%10);
            sum += t * ten;
            bw.write(String.valueOf(t));
            bw.newLine();
            b /= 10;
            ten *= 10;
        }
        bw.write(String.valueOf(sum));
        bw.close();
    }
}
