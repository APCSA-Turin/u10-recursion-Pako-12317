
public class BinarySearchRunner {
    public static void main(String[] args) {
        //    index #: 0   1  2  3   4   5   6   7   8   9  10  11  12  13   14
        int[] arr = {-10, -6, 0, 2, 12, 14, 17, 23, 35, 45, 49, 55, 81, 100, 108}; // sorted list

        int idx = BinarySearch.iterativeNonRecursiveBinarySearch(arr, 23);
        int idx2 = BinarySearch.recursiveBinarySearch(arr, 0, 14, 23);
        System.out.println(idx);
        System.out.println(idx2);
        System.out.println("---------");

        idx = BinarySearch.iterativeNonRecursiveBinarySearch(arr, 55);
        idx2 = BinarySearch.recursiveBinarySearch(arr, 0, 14, 55);
        System.out.println(idx);
        System.out.println(idx2);
        System.out.println("---------");

        idx = BinarySearch.iterativeNonRecursiveBinarySearch(arr, 81);
        idx2 = BinarySearch.recursiveBinarySearch(arr, 0, 14, 81);
        System.out.println(idx);
        System.out.println(idx2);
        System.out.println("---------");

        idx = BinarySearch.iterativeNonRecursiveBinarySearch(arr, 108);
        idx2 = BinarySearch.recursiveBinarySearch(arr, 0, 14, 108);
        System.out.println(idx);
        System.out.println(idx2);
        System.out.println("---------");

        idx = BinarySearch.iterativeNonRecursiveBinarySearch(arr, 13);
        idx2 = BinarySearch.recursiveBinarySearch(arr, 0, 14, 13);
        System.out.println(idx);
        System.out.println(idx2);
        System.out.println("---------");
    }
}
