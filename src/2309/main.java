import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] key = new int[9];
        int sum = -100;
        for (int i = 0; i < 9; ++i) {
            key[i] = Integer.parseInt(br.readLine());
            sum += key[i];
        }
        br.close();

        for (int i = 0; i < 9; ++i) {
            for (int j = i+1; j < 9; ++j) {
                if (key[i]+ key[j] == sum) {
                    key[i] = 0;
                    key[j] = 0;
                    Arrays.sort(key);
                    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
                    for (int k = 2; k < 9; ++k){
                        bw.write(String.valueOf(key[k]));
                        bw.newLine();
                    }
                    bw.close();
                }
            }
        }
    }
}
