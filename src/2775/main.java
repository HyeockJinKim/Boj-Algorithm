import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());
        int[][] apart = new int[15][15];
        for (int i = 1; i < 15; ++i) {
            apart[0][i] = i;
        }
        for (int i = 1; i < 15; ++i) {
            apart[i][1] = apart[i-1][1];
            for (int j = 2; j < 15; ++j) {
                apart[i][j] = apart[i][j-1] + apart[i-1][j];
            }
        }
        for (int i = 0; i < t; ++i) {
            int k, n;
            k = Integer.parseInt(br.readLine());
            n = Integer.parseInt(br.readLine());
            bw.write(String.valueOf(apart[k][n]));
            bw.newLine();
        }
        br.close();
        bw.close();
    }
}
