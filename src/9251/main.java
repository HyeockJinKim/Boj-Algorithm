import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] a = br.readLine().toCharArray();
        char[] b = br.readLine().toCharArray();
        int[][] count = new int[a.length+1][b.length+1];
        br.close();
        int len = 0;
        for (int i = 1; i <= a.length; ++i) {
            for (int j = 1; j <= b.length; ++j) {
                if (a[i-1] == b[j-1]) {
                    count[i][j] = count[i-1][j-1] +1;
                    len = len >= count[i][j] ? len : count[i][j];
                } else {
                    count[i][j] = count[i-1][j] >= count[i][j-1] ? count[i-1][j] : count[i][j-1];
                }
            }
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(String.valueOf(len));
        bw.close();
    }
}
