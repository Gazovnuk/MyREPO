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

    public static int binarySearchRecursive(int[] sortedArray, int key, int low, int high) {
        // считаем индекс центрального элемента
        int middle = low + (high - low) / 2;

        // base case (условие выхода) - регион поиска пустой
        if (low > high) {
            // не нашли элемента, который равен ключу
            return -1;
        }

        if (key == sortedArray[middle]) {
            // в случае, если элемент в центре равняется ключу (нашли элемент)
            return middle;
        } else if (key < sortedArray[middle]) {
            // рекурсивный вызов для левого подмассива
            // не забывайте здесь ключевое слово return (подумайте, зачем оно нужно)
            return binarySearchRecursive(sortedArray, key, low, middle - 1);
        } else {
            // рекурсивный вызов для правого помассива
            return binarySearchRecursive(sortedArray, key, middle + 1, high);
        }
    }
}
