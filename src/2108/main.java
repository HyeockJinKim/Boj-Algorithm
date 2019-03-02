import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] array = new int[n];
        double sum = 0;
        for (int i = 0 ; i < n; ++i) {
            array[i] = Integer.parseInt(br.readLine());
            sum += array[i];
        }
        br.close();
        Arrays.sort(array);
        int cur = array[0], count = 1;
        int maxCount= 0;
        ArrayList<Integer> list = new ArrayList<>();
        if (n == 1)
            list.add(cur);
        for (int i = 1; i < n; ++i) {
            if (cur == array[i]) {
                ++count;
            } else {
                if (maxCount < count) {
                    list = new ArrayList<>();
                    list.add(cur);
                    maxCount = count;
                } else if (maxCount == count) {
                    list.add(cur);
                }
                cur = array[i];
                count = 1;
            }
        }
        if (maxCount < count) {
            list = new ArrayList<>();
            list.add(cur);
        } else if (maxCount == count) {
            list.add(cur);
        }

        int[] t = new int[list.size()];
        for (int i = 0; i < t.length; ++i) {
            t[i] = list.get(i);
        }
        Arrays.sort(t);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(String.valueOf(Math.round(sum/array.length)));
        bw.newLine();
        bw.write(String.valueOf(array[array.length/2]));
        bw.newLine();
        if (t.length > 1) {
            bw.write(String.valueOf(t[1]));
        } else {
            bw.write(String.valueOf(t[0]));
        }
        bw.newLine();
        bw.write(String.valueOf(array[n-1] - array[0]));
        bw.newLine();
        bw.close();
    }
}
