import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        br.close();

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < i; ++j) {
                bw.write(" ");
            }
            for (int j = i; j < n; ++j) {
                bw.write("*");
            }
            bw.newLine();
        }
        bw.close();
    }
}
