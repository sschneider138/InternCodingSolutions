package FizzBuzz;

public class FizzBuzzAns {
    int k;

    public FizzBuzzAns(int k) {
        this.k = k;
    }

    public void solverMethod() {
        for (int i = 0; i <= this.k; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(String.valueOf(i));
            }
        }
    }

    public static void main(String[] args) {
        // instantiate class and call solver method here
        FizzBuzzAns test = new FizzBuzzAns(15);
        test.solverMethod();
    }

}
