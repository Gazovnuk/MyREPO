import java.util.Arrays;

public class Fibonacci {
    public static void main(String[] args) {
        int n = 100;
        long[] mem = new long[n + 1];
        Arrays.fill(mem, -1);
        System.out.println(fibEffective(1000));
    }

    //медленный алгоритм
    private static long fibNative(int n) {
        if (n <= 1)
            return n;
        return fibNative(n - 1) + fibNative(n - 2);
    }

    //Aлгоритм c мемоизацией
    private static long fibNativeEff(int n, long[] mem) {
        if (mem[n] != -1) return mem[n];
        if (n <= 1) return n;
        long result = fibNativeEff(n - 1, mem) + fibNativeEff(n - 2, mem);
        return result;
    }

    //Эффективный алгоритм
    private static long fibEffective(int n) {
        long[] arr = new long[n + 1];
        arr[0] = 0;
        arr[1] = 1;
        for (int i = 2; i <= n; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        return arr[n];
    }
}