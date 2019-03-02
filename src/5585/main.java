import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = 1000-Integer.parseInt(br.readLine());
        br.close();
        int sum = n / 500;
        n -= sum*500;

        int t = n / 100;
        sum += t;
        n -= t * 100;

        t = n / 50;
        sum += t;
        n -= t * 50;
        t = n / 10;
        sum += t;
        n -= t * 10;
        t = n / 5;
        sum += t;
        n -= t * 5;
        sum += n;

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(String.valueOf(sum));
        bw.close();
    }
}
