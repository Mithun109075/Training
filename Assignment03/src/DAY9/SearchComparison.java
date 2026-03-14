package DAY9;
public class SearchComparison {

    // Linear Search
    static int linearSearch(int arr[], int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key)
                return i;
        }
        return -1;
    }

    // Binary Search
    static int binarySearch(int arr[], int key) {
        int low = 0, high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == key)
                return mid;
            else if (arr[mid] < key)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {

        int arr[] = {10, 20, 30, 40, 50, 60, 70};
        int key = 40;

        int result1 = linearSearch(arr, key);
        int result2 = binarySearch(arr, key);

        System.out.println("Linear Search Index: " + result1);
        System.out.println("Binary Search Index: " + result2);
    }
}
