package Heaps;

public class HeapsImplementation {
    static int size = 0;
    static int[] heap = new int[100];

    public static void insert(int x) {
        size++;
        heap[size - 1] = x;
        int i = size - 1;
        while (i > 0 && heap[(i - 1) / 2] > heap[i]) {
            swap((i - 1) / 2, i);
            i = (i - 1) / 2;
        }
    }

    public static int delete() {
        if (size == 0) {
            throw new IllegalStateException("Heap is empty");
        }
        int popped = heap[0];
        heap[0] = heap[size - 1];
        size--;
        heapifyDown(0);
        return popped;
    }

    public static void heapifyDown(int i) {
        int smallest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < size && heap[left] < heap[smallest]) {
            smallest = left;
        }

        if (right < size && heap[right] < heap[smallest]) {
            smallest = right;
        }

        if (smallest != i) {
            swap(i, smallest);
            heapifyDown(smallest);
        }
    }

    public static int getMin() {
        if (size == 0) {
            throw new IllegalStateException("Heap is empty");
        }
        return heap[0];
    }

    public static void print() {
        for (int i = 0; i < size; i++) {
            System.out.print(heap[i] + " ");
        }
        System.out.println();
    }

    public static void swap(int a, int b) {
        int temp = heap[a];
        heap[a] = heap[b];
        heap[b] = temp;
    }

    public static void main(String[] args) {
        insert(10);
        insert(8);
        insert(6);
        print();
        insert(7);
        print();
        System.out.println("Min element: " + getMin());
        System.out.println("Deleted element: " + delete());
        print();
        System.out.println("Deleted element: " + delete());
        print();
        System.out.println("Min element: " + getMin());
    }
}
