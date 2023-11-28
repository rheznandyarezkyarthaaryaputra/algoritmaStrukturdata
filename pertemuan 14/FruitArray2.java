public class FruitArray2 {

    public static void main(String[] args) {
        // Define an array of strings with fruit names
        String[] fruits = {"apple", "banana", "cherry", "date", "eggplant"};

        // Print the array
        System.out.print("[");
        for (int i = 0; i < fruits.length; i++) {
            System.out.print(fruits[i]);
            if (i < fruits.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
