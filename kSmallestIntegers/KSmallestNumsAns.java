import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Collections;
import java.util.Comparator;

public class KSmallestNumsAns {
    ArrayList<Integer> inputArr;
    int k;

    public KSmallestNumsAns(ArrayList<Integer> inputArr, int k) {
        this.inputArr = inputArr;
        this.k = k;
    }

    // method 1 - iterate over list of k items, add largest to temp list and remove
    // from original list
    public ArrayList<Integer> method1() {
        ArrayList<Integer> largestInts = new ArrayList<>();

        int counter = 0;
        while (counter != this.k) {
            largestInts.add(Collections.max(this.inputArr));
            this.inputArr.remove(Collections.max(this.inputArr));
            counter++;
        }
        return largestInts;
    }

    // method 2 - sort list and pop k final elements
    public ArrayList<Integer> method2() {
        ArrayList<Integer> largestInts = new ArrayList<>();
        Collections.sort(this.inputArr);

        for (int i = 0; i < this.k; i++) {
            largestInts.add(this.inputArr.remove(this.inputArr.size() - 1));
        }
        return largestInts;
    }

    // method 3 - pop from top of max heap k times
    public ArrayList<Integer> method3() {
        ArrayList<Integer> largestInts = new ArrayList<>();
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(this.inputArr.size(), Comparator.reverseOrder());
        maxHeap.addAll(this.inputArr);

        for (int i = 0; i < this.k; i++) {
            largestInts.add(maxHeap.poll());
        }
        return largestInts;
    }

    // method 4 - scan through list and update stored large values as list is
    // traversed
    public ArrayList<Integer> method4() {
        ArrayList<Integer> largestInts = new ArrayList<>(Arrays.asList(-1, -1, -1));
        for (int num : this.inputArr) {
            int minIndex = largestInts.indexOf(Collections.min(largestInts));
            if (num > largestInts.get(minIndex)) {
                largestInts.set(minIndex, num);
            }
        }
        return largestInts;
    }

    public static void main(String[] args) {

        ArrayList<Integer> testList = new ArrayList<>(Arrays.asList(20, 6, 13, 9, 15, 8, 4, 1, 11, 3, 20));

        KSmallestNumsAns testSol = new KSmallestNumsAns(testList, 3);
        System.out.println(testSol.method4());
    }

}