
public class BinarySearch {

    // RECURSIVE IMPLEMENTATION
    public static int recursiveBinarySearch(int[] elements, int lowPosition, int highPosition, int target) {
        if (lowPosition > highPosition) {
            return -1;  // base case: target was not found, return -1
        } else {
            int midPosition = (lowPosition + highPosition) / 2;

            if (elements[midPosition] < target) {
                /* ------ COMPLETE ME with a recursive call ------ */
                return recursiveBinarySearch(elements, midPosition + 1, highPosition, target);
            } else if (elements[midPosition] > target) {
                /* ------ COMPLETE ME with a recursive call ------ */
                return recursiveBinarySearch(elements, lowPosition, midPosition - 1, target);
            } else {
                // otherwise, target found, return that index
                return midPosition;
            }
        }
    }

    // ITERATIVE, NON-RECURSIVE IMPLEMENTATION -- FOR COMPARISON
    public static int iterativeNonRecursiveBinarySearch(int[] elements, int target) {
        int lowPosition = 0;
        int highPosition = elements.length - 1;

        while (lowPosition <= highPosition) {
            int midPosition = (lowPosition + highPosition) / 2;

            if (elements[midPosition] < target) {
                lowPosition = midPosition + 1;
            } else if (elements[midPosition] > target) {
                highPosition = midPosition - 1;
            } else {
                // else, target found, return its index
                return midPosition;
            }
        }
        // target was not found, return -1
        return -1;
    }

    public static int bSearch(int[] arr, int left, int right, int target) {
        if (right >= left) {
            int mid = (left + right) / 2;
            if (arr[mid] == target) {
            return mid;
            } else if (arr[mid] > target) {
            return bSearch(arr, left, mid - 1, target);
            } else {
            return bSearch(arr, mid + 1, right, target);
            }
        }
        return -1;
    }

}
