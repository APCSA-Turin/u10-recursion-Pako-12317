public class BinaryRunner2 {
    public static void main(String[] args) {
        //    index #: 0   1  2  3   4   5   6   7   8   9  10  11  12  13   14
        int[] arr = {-10, -6, 0, 2, 12, 14, 17, 23, 35, 45, 49, 55, 81, 100, 108};


        int idx3 = BinarySearch.recursiveBinarySearch(arr, 0, 14, 49);
        System.out.println(idx3);

        //Write an additional test case to find the target value of 50 in the array (a target not in the array).  Test both methods to make sure both output the same correct index (should both return an index of -1)
        int idx4 = BinarySearch.recursiveBinarySearch(arr, 0, 14, 50);
        System.out.println(idx4); // should print -1
    }
}
