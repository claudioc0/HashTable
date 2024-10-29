public class Main {
    public static void main(String[] args) {
        HashTable hashTable = new HashTable(10);

        hashTable.insert(23);
        hashTable.insert(45);
        hashTable.insert(64);
        hashTable.insert(12);
        hashTable.insert(90);
        hashTable.insert(89);
        hashTable.insert(76);
        hashTable.insert(1);
        hashTable.insert(22);
        hashTable.insert(399);

        System.out.println("Antes do Bubble Sort" + hashTable);

        hashTable.bubbleSort();


        System.out.println("\nDepois do Bubble Sort: " + hashTable + "\n");

        HashTable hashTable1 = new HashTable(10);

        hashTable1.insert(92);
        hashTable1.insert(78);
        hashTable1.insert(17);
        hashTable1.insert(23);
        hashTable1.insert(41);
        hashTable1.insert(11);
        hashTable1.insert(79);
        hashTable1.insert(67);
        hashTable1.insert(43);
        hashTable1.insert(399);

        System.out.println("Antes do Insertion Sort" + hashTable1);

        hashTable1.insertionSort();

        System.out.println("\nDepois do Insertion Sort: " + hashTable1 + "\n");


        HashTable hashTable2 = new HashTable(10);

        hashTable2.insert(18);
        hashTable2.insert(81);
        hashTable2.insert(78);
        hashTable2.insert(92);
        hashTable2.insert(33);
        hashTable2.insert(44);
        hashTable2.insert(66);
        hashTable2.insert(55);
        hashTable2.insert(91);
        hashTable2.insert(399);

        System.out.println("Antes do Quick Sort" + hashTable2);

        hashTable2.quickSort();

        System.out.println("\nDepois do Quick Sort" + hashTable2 + "\n");


    }
}