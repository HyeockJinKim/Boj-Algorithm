public class Test {
    long sum(int[] a) {
        long ans = 0;
        int size = a.length;
        for (int i = 0; i < size; ++i) {
            ans += a[i];
        }
        return ans;
    }
}
