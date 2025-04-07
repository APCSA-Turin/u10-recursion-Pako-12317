public class BinaryRunner2 {
    public static void main(String[] args) {
        //Analyze the code below and determine the printed output.  Notice how 12 and 55 are repeated in the array:
        //    index #: 0   1  2  3   4   5   6   7   8   9   10  11  12  13   14
        int[] arr = {-10, -6, 0, 12, 12, 14, 17, 23, 35, 45, 55, 55, 55, 100, 108};
        
        int idx = BinarySearch.iterativeNonRecursiveBinarySearch(arr, 12);
        int idx2 = BinarySearch.recursiveBinarySearch(arr, 0, 14, 12);
        System.out.println(idx);
        System.out.println(idx2);
        System.out.println("---------");
        
        idx = BinarySearch.iterativeNonRecursiveBinarySearch(arr, 55);
        idx2 = BinarySearch.recursiveBinarySearch(arr, 0, 14, 55);
        System.out.println(idx);
        System.out.println(idx2);
        System.out.println("---------");
    
    }
}
