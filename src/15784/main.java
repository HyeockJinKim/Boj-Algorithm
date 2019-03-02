import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n, a, b;
        String[] line = br.readLine().split(" ");
        n = Integer.parseInt(line[0]);
        a = Integer.parseInt(line[1]);
        b = Integer.parseInt(line[2]);
        int[][] x = new int[n+1][n+1];
        for (int i = 1; i <= n; ++i) {
            line = br.readLine().split(" ");
            for (int j = 1; j <= n; ++j) {
                x[i][j] = Integer.parseInt(line[j-1]);
            }
        }
        br.close();

        for (int i = 1; i <= n; ++i) {
            if (x[a][i] > x[a][b]) {
                System.out.println("ANGRY");
                return ;
            }
            if (x[i][b] > x[a][b]) {
                System.out.println("ANGRY");
                return ;
            }
        }
        System.out.println("HAPPY");
    }
}
