import java.util.Arrays;

public class HashTable {
    private int[] keys;
    private int size;

    public HashTable(int capacity) {
        keys = new int[capacity];
        this.size = 1;
    }

    private int hash(int key) {
        return key % keys.length;
    }

    public void insert(int key) {
        int value = hash(key);
        while (keys[value] != 0) {
            value = (value + 1) % keys.length;
        }
        keys[value] = key;
        size++;
    }

    public void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public void bubbleSort() {
        for (int i = 0; i < size - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < size - i - 1; j++) {
                if (keys[j] > keys[j + 1]) {
                    swap(keys, j, j + 1);
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
    }

    public void insertionSort() {
        for (int i = 1; i < size; i++) {
            int key = keys[i];
            int j = i - 1;

            while (j >= 0 && keys[j] > key) {
                keys[j + 1] = keys[j];
                j--;
            }
            keys[j + 1] = key;
        }
    }

    public void quickSort() {
        quickSort(keys, 0, size - 1);
    }

    private void quickSort(int[] array, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(array, low, high);
            quickSort(array, low, pivotIndex - 1);
            quickSort(array, pivotIndex + 1, high);
        }
    }

    private int partition(int[] array, int low, int high) {
        int pivot = array[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (array[j] <= pivot) {
                i++;
                swap(array, i, j);
            }
        }

        swap(array, i + 1, high);
        return i + 1;
    }

    public boolean search(int key) {
        int value = hash(key);
        while (keys[value] != 0) {
            if (keys[value] == key) return true;
            value = (value + 1) % keys.length;
        }
        return false;
    }

    public int remove(int key) {
        int value = hash(key);
        while (keys[value] != 0) {
            if (keys[value] == key) {
                int removedKey = keys[value];
                keys[value] = 0;
                size--;
                return removedKey;
            }
            value = (value + 1) % keys.length;
        }
        return -1; 
    }

    @Override
    public String toString() {
        return Arrays.toString(keys);
    }
}

