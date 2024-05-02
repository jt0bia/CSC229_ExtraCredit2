public class RatioOfNumbers {
    public static void main(String[] args) {
        int[] array = {93,12,3,7,90,94,142,109,142}; // test loop
        int small1 = Integer.MAX_VALUE, small2 = Integer.MAX_VALUE, large1 = 0, large2 = 0;
        int i, smallSum, largeSum;
        double ratioOfSums;

        // loop to find 2 smallest numbers of loop - O(n)
        for (i = 0; i < array.length; i++) {
            if (array[i] < small1) {
                small2 = small1;
                small1 = array[i];
            }
            else if (array[i] < small2)
                small2 = array[i];
        }

        // loop to find 2 largest numbers of loop - O(n)
        for (i = 0; i < array.length; i++) {
            if (array[i] > large1) {
                large2 = large1;
                large1 = array[i];
            }
            else if (array[i] > large2)
                large2 = array[i];
        }

        // calculations to find sums and the ratio of sums
        smallSum = small1 + small2;
        largeSum = large1 + large2;
        ratioOfSums = (double) largeSum / smallSum;

        // prints answer
        System.out.println(ratioOfSums);
    }
}

// Time and space complexity analysis

// The following algorithm has a Big O of n (linear) because each for-loop depends
// on the size on the array, thus execution taking n amount of time. Since each loop
// is separated from each other and not nested, Big O remains n instead of n^2.

// The space complexity is O(1) because the size of the array remains constant
// within the execution of the algorithm.