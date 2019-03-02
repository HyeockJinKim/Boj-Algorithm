import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] names = br.readLine().toCharArray();
        br.close();
        int[] alpha = new int[30];

        TreeSet<Character> treeSet = new TreeSet<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < names.length; ++i) {
            ++alpha[names[i]-'A'];
            treeSet.add(names[i]);
        }
        int count = 0;
        char temp = '1';
        for (int i = 0; i < 26; ++i) {
            if (alpha[i] % 2 != 0) {
                temp = (char)(i+'A');
                --alpha[i];
                ++count;
            }
        }
        if (count >1) {
            System.out.println("I'm Sorry Hansoo");
            return ;
        }

        while (!treeSet.isEmpty()) {
            char t = treeSet.pollFirst();
            for (int i = 0; i < alpha[t - 'A'] / 2; ++i)
                sb.append(t);
        }
        char t = temp;

        System.out.print(sb.toString());
        if (count != 0) {
            System.out.print(t);
        }
        System.out.println(sb.reverse().toString());
    }
}
