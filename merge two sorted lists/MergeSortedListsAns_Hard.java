import java.util.Arrays;
import java.util.PriorityQueue;

public class MergeSortedListsAns_Hard {
    int[] arr1;
    int[] arr2;

    // constructor
    public MergeSortedListsAns_Hard(int[] arr1, int[] arr2) {
        this.arr1 = arr1;
        this.arr2 = arr2;
    }

    // solution method -- edit this
    public Integer[] mergeWithMinHeapMethod() {
        // write your code here
        // don't forget to change return type as needed! currently set to 'void'

        // make array to store values
        // problem is arrs are ints, not Integers
        // must loop over arrs and case ints to Integers manually to populate priority
        // queues
        Integer[] mergedArr = new Integer[this.arr1.length + this.arr2.length];

        // make priority queues
        PriorityQueue<Integer> arr1Queue = new PriorityQueue<>();
        PriorityQueue<Integer> arr2Queue = new PriorityQueue<>();

        // convert int[] arr1 into priority queue
        for (int i = 0; i < this.arr1.length; i++) {
            arr1Queue.add(Integer.valueOf(this.arr1[i]));
        }

        // convert int[] arr2 into priority queue
        for (int i = 0; i < this.arr2.length; i++) {
            arr2Queue.add(Integer.valueOf(this.arr2[i]));
        }

        // set counter to iterate over merged list as it is populated
        int counter = 0;

        // while either queue is not empty
        while (!arr1Queue.isEmpty() || !arr2Queue.isEmpty()) {

            // if both lists are not empty, compare elements and pop minimum
            // update counter
            if (!arr1Queue.isEmpty() && !arr2Queue.isEmpty()) {
                if (arr1Queue.peek() < arr2Queue.peek()) {
                    mergedArr[counter] = arr1Queue.poll();
                    counter++;
                } else {
                    mergedArr[counter] = arr2Queue.poll();
                    counter++;
                }
            }
            // if only queue 1 has Integers in it
            else if (!arr1Queue.isEmpty()) {
                mergedArr[counter] = arr1Queue.poll();
                counter++;
            }
            // if only queue 2 has Integers in it
            else if (!arr2Queue.isEmpty()) {
                mergedArr[counter] = arr2Queue.poll();
                counter++;
            }
        }
        return mergedArr;
    }

    public static void main(String[] args) {
        // instantiate class and call solver method here
        int[] a = { 1, 4, 6 };
        int[] b = { 2, 5, 12, 54 };
        MergeSortedListsAns_Hard test = new MergeSortedListsAns_Hard(a, b);
        Integer[] mergedArr = test.mergeWithMinHeapMethod();

        for (int i = 0; i < mergedArr.length; i++) {
            System.out.print(mergedArr[i] + " ");
        }
        System.out.println();
    }
}