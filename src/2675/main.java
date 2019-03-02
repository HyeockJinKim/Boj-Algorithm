import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());
        StringBuilder[] sb = new StringBuilder[t];

        for (int i = 0; i < t; ++i) {
            sb[i] = new StringBuilder();
            String[] line = br.readLine().split(" ");
            int r = Integer.parseInt(line[0]);
            for (int k = 0; k < line[1].length(); ++k) {
                for (int j = 0; j < r; ++j)
                    sb[i].append(line[1].charAt(k));
            }
        }
        br.close();
        for (int i = 0; i < t; ++i) {
            System.out.println(sb[i].toString());
        }


    }
}
