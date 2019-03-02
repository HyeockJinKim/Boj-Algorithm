import java.util.*;

public class Main {
    public static void main(String[] args) {

        int loop;
        Scanner scanner = new Scanner(System.in);
        loop = scanner.nextInt();
        MyQueue myQueue = new MyQueue();
        for (int i = 0; i < loop; ++i) {
            String poll = scanner.next();
            switch (poll) {
                case "push":
                    myQueue.push(Integer.parseInt(scanner.next()));
                    break;
                case "pop":
                    System.out.println(myQueue.pop());
                    break;
                case "size":
                    System.out.println(myQueue.size());
                    break;
                case "empty":
                    System.out.println(myQueue.isEmpty());
                    break;
                case "front":
                    System.out.println(myQueue.front());
                    break;
                case "back":
                    System.out.println(myQueue.back());
                    break;
                default:
                    break;
            }
        }

    }
}
class MyQueue {
    private int[] queue;
    private int start;
    private int end;

    public MyQueue() {
        queue = new int[10000];
        start = 0;
        end = 0;
    }

    public void push(int value) {
        queue[start++] = value;
    }

    public int pop() {
        if (start == end) {
            return -1;
        }
        return queue[end++];
    }
    public int size() {
        return start - end;
    }

    public int front() {
        if (start == end) {
            return -1;
        }
        return queue[end];
    }

    public int back() {
        if (start == end) {
            return -1;
        }
        return queue[start-1];
    }

    public int isEmpty() {
        if (start == end) {
            return 1;
        }
        return 0;
    }


}