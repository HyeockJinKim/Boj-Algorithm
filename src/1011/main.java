import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    private static int[] result;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        result = new int[92682];
        result[1] = 1;
        result[2] = 2;
        for (int i = 2; i < 46341; ++i) {
            int temp = i*2;
            result[temp-1] = result[temp-2]+i;
            result[temp] = result[temp-1]+i;
        }
        result[92681] = Integer.MAX_VALUE;
        int t = Integer.parseInt(br.readLine());
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i = 0; i < t; ++i) {
            StringTokenizer tokenizer = new StringTokenizer(br.readLine());
            int t1, t2;
            t1 = Integer.parseInt(tokenizer.nextToken());
            t2 = Integer.parseInt(tokenizer.nextToken());
            int index = binarySearch(t2-t1);
            bw.write(String.valueOf(index));
            bw.newLine();
        }
        br.close();
        bw.close();
    }
    private static int binarySearch(int value) {
        int left, right, mid;
        left = 0;
        right = result.length;
        mid = (right+left)/2;
        while (left <= right) {
            mid = (right+left)/2;
            if (value == result[mid]) {
                return mid;
            } else {
                if (value < result[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
        }
        if (value < result[mid])
            return mid;
        return mid + 1;
    }
}

