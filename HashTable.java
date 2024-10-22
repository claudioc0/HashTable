import java.util.Arrays;

public class HashTable {
    private int[] keys;

    public HashTable(int size) {
        keys = new int[size];
    }

    private int hash(int key) {
        return key % keys.length;
    }

    public void insert(int key) {
        int value = hash(key);
        keys[value] = key;
    }

    public void bubbleSort(){
        int n = keys.length;
        boolean swapped;
        for (int i = 0; i < n  - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++){
                if ( keys[j] > keys[j + 1]){
                    int temp = keys[j];
                    keys[j] = keys[j + 1];
                    keys[j + 1] = temp;
                    swapped = true;
                }
            }
        }
    }


    public void insertionSort(){
        int n = keys.length;
        for (int i = 0; i < n; i++) {
            int key = keys[i];
            int j = i - 1;

            while (j >= 0 && keys[j] > key){
                keys[j + 1] = keys[j];
                j--;
            }
            keys[j + 1] = key;
        };
        
    }

    public boolean search(int key) {
        int value = hash(key);
        if(keys[value] == key) {
            return true;
        }
        return false;
    }

    public int remove(int key) {
        int value = hash(key);
        int removedKey = keys[value];
        keys[value] = 0;

        return removedKey;
    }

    @Override
    public String toString() {
        return Arrays.toString(keys);
    }
}
