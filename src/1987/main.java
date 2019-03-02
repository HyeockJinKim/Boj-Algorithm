import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    private static char[][] board;
    private static boolean[] isSearched = new boolean[26];
    private static int count, r, c;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] rc = br.readLine().split(" ");
        r = Integer.parseInt(rc[0]);
        c = Integer.parseInt(rc[1]);
        board = new char[r][c];
        count = 0;
        for (int i = 0; i < r; ++i) {
            board[i] = br.readLine().toCharArray();
        }
        br.close();
        search(0, 0, 1);
        System.out.println(count);

    }

    private static void search(int i, int j, int n) {
        int index = board[i][j]-'A';
        if (isSearched[index])
            return;
        isSearched[index] = true;
        if (n > count) {
            count = n;
        }
        if (i+1 < r)
            search(i+1, j, n+1);
        if (j+1 < c)
            search(i, j+1, n+1);
        if (i > 0)
            search(i-1, j, n+1);
        if (j > 0)
            search(i, j-1, n+1);
        isSearched[index] = false;
    }
}