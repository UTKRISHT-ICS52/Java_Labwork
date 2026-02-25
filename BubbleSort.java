// Bubble Sort Algorithm in Java by inner and outer loop
public class BubbleSort {
   public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;
   for (int i = 0; i < n - 1; i++) {
            swapped = false;
    for (int j = 0; j < n - i - 1; j++) {
                     if (arr[j] > arr[j + 1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    
                    swapped = true;
                }
            }

            if (!swapped) break;
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 3, 4,1};

        bubbleSort(arr);
    System.out.println("Sorted Array by Bubble Sort:");
        for (int num : arr)
            System.out.print(num + " ");
    }
}
