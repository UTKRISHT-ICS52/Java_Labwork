public class SelectionSort {
   public static void selectionSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
       for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // swap
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
    public static void main(String[] args) {
        int[] arr = {52,42,3,61,2};

        selectionSort(arr);
      System.out.println("Sorted Array by Selection Sort:");
        for (int num : arr)
            System.out.print(num + " ");
    }
}
