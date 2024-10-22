public class Main {
    public static void main(String[] args) {
        HashTable table = new HashTable(10);

        table.insert(12);
        table.insert(25);
        table.insert(37);
        table.insert(41);
        table.insert(53);
        table.insert(64);
        table.insert(78);
        table.insert(89);
        table.insert(20);
        table.insert(39);
        table.insert(99);

        System.out.println(table);

        System.out.println(table.search(12));
        System.out.println(table.search(99));

        System.out.println(table.remove(12));

        table.bubbleSort();
        System.out.println(table);

    }
}