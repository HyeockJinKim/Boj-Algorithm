import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] line = br.readLine().split(" ");
        int x, y, w, h;
        x = Integer.parseInt(line[0]);
        y = Integer.parseInt(line[1]);
        w = Integer.parseInt(line[2]);
        h = Integer.parseInt(line[3]);
        br.close();
        int minx, miny;
        minx = w-x < x ? w - x : x;
        miny = h-y < y ? h - y : y;
        System.out.println(minx > miny ? miny : minx);
    }
}
