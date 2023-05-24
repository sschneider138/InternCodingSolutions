
public class FibonacciTemplate {
    int n;

    // constructor
    public FibonacciTemplate(int n) {
        this.n = n;
    }

    // solution method -- edit this
    public int recursiveFib(int fibNum) {
        // this is the recursive method where most of the work is done
        // this must be separate from the "startRecursiveFib()" method becuase it
        // must take in the decreasing numbers
        return 0;
    }

    public int startRecursiveFib() {
        // I did this one for you
        // this method start off the recursion. it takes in the value
        // defined upon instantiation of the class and begins the recursion

        // you do not need to touch this one
        return this.recursiveFib(this.n);
    }

    public static void main(String[] args) {

        // instantiate class and kick off recursion here
        return;
    }

}
