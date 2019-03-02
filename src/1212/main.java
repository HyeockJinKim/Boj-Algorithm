import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char[] ox= br.readLine().toCharArray();
        br.close();
        StringBuilder sb = new StringBuilder();
        switch (ox[0]) {
            case '1':
                sb.append("1");
                break;
            case '2':
                sb.append("10");
                break;
            case '3':
                sb.append("11");
                break;
            case '4':
                sb.append("100");
                break;
            case '5':
                sb.append("101");
                break;
            case '6':
                sb.append("110");
                break;
            case '7':
                sb.append("111");
                break;
            default:
                sb.append("0");
                break;
        }
        for (int i = 1; i < ox.length; ++i) {
            switch (ox[i]) {
                case '1':
                    sb.append("001");
                    break;
                case '2':
                    sb.append("010");
                    break;
                case '3':
                    sb.append("011");
                    break;
                case '4':
                    sb.append("100");
                    break;
                case '5':
                    sb.append("101");
                    break;
                case '6':
                    sb.append("110");
                    break;
                case '7':
                    sb.append("111");
                    break;
                default:
                    sb.append("000");
                    break;
            }
        }
        System.out.println(sb.toString());
    }
}
