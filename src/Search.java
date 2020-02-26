public class Search {
    public static int linearSearch(int[] arr, int k) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == k) return i;
        }
        return -1;
    }

    public static int binarySearch(int[] arr, int k) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int middle = low + (high - low) / 2;

            if (k < arr[middle]) {
                high = middle - 1;
            } else if (k > arr[middle]) {
                low = middle + 1;
            } else {
                return middle;
            }
        }
        return -1;
    }
}
