
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Map<Integer, ArrayList> fibonacciMap = new HashMap<>();
        ArrayList zero = new ArrayList();
        zero.add(1);
        zero.add(0);
        ArrayList one = new ArrayList();
        one.add(0);
        one.add(1);
        fibonacciMap.put(0,zero);
        fibonacciMap.put(1,one);
        for (int i = 2; i<= 40; ++i) {
            final ArrayList temp = new ArrayList();
            temp.add((int)fibonacciMap.get(i-2).get(0)+(int)fibonacciMap.get(i-1).get(0));
            temp.add((int)fibonacciMap.get(i-2).get(1)+(int)fibonacciMap.get(i-1).get(1));
            fibonacciMap.put(i,temp);
        }
        int roopNum;
        Scanner scanner = new Scanner(System.in);
        roopNum = scanner.nextInt();
        int[] input = new int[30000];
        for (int i = 0; i < roopNum; ++i){
            input[i] = scanner.nextInt();
        }
        
        for (int i = 0; i < roopNum; ++i){
            System.out.println(fibonacciMap.get(input[i]).get(0) + " " + fibonacciMap.get(input[i]).get(1) );
        }

    }

}