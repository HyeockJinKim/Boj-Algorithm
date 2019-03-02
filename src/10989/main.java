import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] array = new int[n];
        for (int i = 0 ; i < n; ++i) {
            array[i] = Integer.parseInt(br.readLine());
        }
        br.close();
        Arrays.sort(array);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i = 0; i < n; ++i) {
            bw.write(String.valueOf(array[i]));
            bw.newLine();
        }
        bw.close();
    }
}
