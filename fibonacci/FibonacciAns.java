import java.util.Arrays;

public class FibonacciAns {
    int n;

    public FibonacciAns(int n) {
        this.n = n;
    }

    public int recursiveFib(int fibNum) {
        if (fibNum < 2) {
            return fibNum;
        }
        return this.recursiveFib(fibNum - 1) + this.recursiveFib(fibNum - 2);
    }

    public int startRecursiveFib() {
        return this.recursiveFib(this.n);
    }

    public long dynamicFib() {
        long[] storage = new long[this.n + 1];
        Arrays.fill(storage, -1);
        storage[0] = 0;
        storage[1] = 1;
        for (int i = 0; i < this.n + 1; i++) {
            if (storage[i] == -1) {
                storage[i] = storage[i - 1] + storage[i - 2];
            }
        }
        return storage[storage.length - 1];
    }

    // make table using size two array to show space complexity

    public static void main(String[] args) {
        FibonacciAns fibSol = new FibonacciAns(100);
        System.out.println(fibSol.dynamicFib());
    }
}