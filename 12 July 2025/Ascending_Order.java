public class Ascending_Order {
    public static void SortedArray(int[] arr) {
        boolean isSorted = true;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                isSorted = false;
                break;
            }
        }

        if (isSorted) {
            System.out.println("Array is sorted in ascending order!");
        } else {
            System.out.println("Array is not sorted in ascending order!");
        }
    }

    public static void main(String[] args) {
        int[] arr = {10, 30, 20, 64, 9, 26};
        SortedArray(arr);
    }
}