import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n;
        StringBuilder sb = new StringBuilder();
        n = Integer.parseInt(br.readLine());
        String[] files = new String[n];
        for (int i = 0; i < n; ++i) {
            files[i] = br.readLine();
        }
        br.close();
        int len = files[0].length();
        boolean isEqual = true;
        for (int i = 0; i < len; ++i) {
            char ch = files[0].charAt(i);
            for (int j = 1; j < n; ++j) {
                if (files[j].charAt(i) != ch) {
                    isEqual = false;
                    break;
                }
            }
            if (isEqual) {
                sb.append(ch);
            } else {
                sb.append("?");
                isEqual = true;
            }
        }
        System.out.println(sb.toString());


    }
}
