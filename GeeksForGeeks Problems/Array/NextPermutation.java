class NextPermutation {
    void nextPermutation(int[] arr) {
        int n = arr.length;
        int i = n - 2;

        // Step 1: Find the first decreasing element from the end
        while (i >= 0 && arr[i] >= arr[i + 1]) {
            i--;
        }

        if (i >= 0) {
            // Step 2: Find the next greater element from the end
            int j = n - 1;
            while (arr[j] <= arr[i]) {
                j--;
            }
            // Step 3: Swap them
            swap(arr, i, j);
        }

        // Step 4: Reverse the part after i
        reverse(arr, i + 1, n - 1);
    }

    // Swap utility
    void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // Reverse utility
    void reverse(int[] arr, int start, int end) {
        while (start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }
    }
    
    public static void main(String[] args) {
        NextPermutation sol = new NextPermutation();
        int[] arr = {1, 2, 3};
        sol.nextPermutation(arr);
        for (int num : arr) {
            System.out.print(num + " ");
        }
        // Output: 1 3 2
    }

}
