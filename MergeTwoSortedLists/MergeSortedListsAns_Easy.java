
// useful imports; you may not need these depending on your approach

public class MergeSortedListsAns_Easy {
    int[] arr1;
    int[] arr2;

    // constructor
    public MergeSortedListsAns_Easy(int[] arr1, int[] arr2) {
        this.arr1 = arr1;
        this.arr2 = arr2;
    }

    // solution method -- edit this
    public int[] mergeMethod() {
        int[] outputList = new int[this.arr1.length + this.arr2.length];

        int ptr1 = 0;
        int ptr2 = 0;

        // for all elements that will be added into the new merged array
        for (int i = 0; i < outputList.length; i++) {
            // if both indices are in range
            if (ptr1 < this.arr1.length && ptr2 < this.arr2.length) {
                if (this.arr1[ptr1] <= this.arr2[ptr2]) {
                    outputList[i] = this.arr1[ptr1];
                    ptr1++;
                } else {
                    outputList[i] = this.arr2[ptr2];
                    ptr2++;
                }
            }
            // if arr1 is in range but arr2 is not
            else if (ptr1 < this.arr1.length) {
                outputList[i] = this.arr1[ptr1];
                ptr1++;
            }
            // if arr2 is in range but arr1 is not
            else if (ptr2 < this.arr2.length) {
                outputList[i] = this.arr2[ptr2];
                ptr2++;
            } else {
                break;
            }
        }
        return outputList;
    }

    public static void main(String[] args) {
        // instantiate class and call solver method here
        int[] a = { 1, 4, 6 };
        int[] b = { 2, 5, 12, 54 };
        MergeSortedListsAns_Easy test = new MergeSortedListsAns_Easy(a, b);
        int[] mergedArr = test.mergeMethod();

        for (int i = 0; i < mergedArr.length; i++) {
            System.out.print(mergedArr[i] + " ");
        }
        System.out.println();
    }
}
