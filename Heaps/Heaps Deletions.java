package Heaps;

public class HeapsDeletion {
 
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void heapify(int[] arr, int n, int i) {
        int largest = i; // Initialize largest as root
        int left = 2 * i + 1; // left child
        int right = 2 * i + 2; // right child

        // If left child is larger than root
        if (left < n && arr[left] > arr[largest]) {
            largest = left;
        }

        // If right child is larger than the largest so far
        if (right < n && arr[right] > arr[largest]) {
            largest = right;
        }

        // If largest is not root
        if (largest != i) {
            swap(arr, i, largest);

            // Recursively heapify the affected sub-tree
            heapify(arr, n, largest);
        }
    }

    public static int delete(int[] arr, int n) {
        if (n == 0) {
            throw new IllegalStateException("Heap is empty");
        }

        // Move the last element to the root
        arr[0] = arr[n - 1];
        n--; // Reduce the size of the heap

        // Heapify the root element to maintain the max-heap property
        heapify(arr, n, 0);

        return n;
    }

    public static void printArray(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = new int[100];

        // Initialize the heap
        arr[0] = 100;
        arr[1] = 70;
        arr[2] = 60;
        arr[3] = 40;
        arr[4] = 50;
        int n = 5;

        System.out.println("Before delete, heap elements are : ");
        printArray(arr, n);

        n = delete(arr, n);

        System.out.println("After delete, heap elements are : ");
        printArray(arr, n);
    }
}
