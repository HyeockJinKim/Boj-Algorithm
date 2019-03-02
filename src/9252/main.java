import java.io.*;
import java.util.ArrayList;

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
        bw.newLine();
        int index = a.length;
        ArrayList<Character> temp = new ArrayList<>();
        for (int i = b.length; i > 0 && index > 0; ) {
            while (index > 0 && count[index][i] == count[index-1][i]) {
                --index;
            }
            while (i > 0 && count[index][i] == count[index][i-1]) {
                --i;
            }
            if (i > 0 && index > 0) {
                temp.add(b[i - 1]);
                --i;
                --index;
            }
        }
        int lent = temp.size();
        for (int i = lent-1; i >= 0; --i) {
            bw.write(temp.get(i));
        }
        bw.close();
    }
}
