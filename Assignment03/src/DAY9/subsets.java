package DAY9;
public class subsets {

    static void generateSubsets(int[] arr, int n) {
        int total = 1 << n;   // 2^n subsets

        for (int i = 0; i < total; i++) {
            System.out.print("{ ");
            for (int j = 0; j < n; j++) {
                if ((i & (1 << j)) != 0) {
                    System.out.print(arr[j] + " ");
                }
            }
            System.out.println("}");
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        int n = arr.length;

        System.out.println("All Subsets:");
        generateSubsets(arr, n);
    }
}
