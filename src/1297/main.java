import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] line = br.readLine().split(" ");
        int d, x, y;
        d = Integer.parseInt(line[0]);
        x = Integer.parseInt(line[1]);
        y = Integer.parseInt(line[2]);
        br.close();

        double r = d/Math.sqrt(x*x+y*y);
        x *= r;
        y *= r;
        System.out.println(String.format("%d %d", x, y));
    }
}
