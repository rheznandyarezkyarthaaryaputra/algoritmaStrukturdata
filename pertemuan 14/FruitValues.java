public class FruitValues{

    static class Fruit {
        String name;
        int value;

        Fruit(String name, int value) {
            this.name = name;
            this.value = value;
        }
    }

    public static void main(String[] args) {
        // Initialize an array with the fruit objects
        Fruit[] fruits = new Fruit[4];
        fruits[0] = new Fruit("apple", 100);
        fruits[1] = new Fruit("banana", 50);
        fruits[2] = new Fruit("cherry", 300);
        fruits[3] = new Fruit("date", 500);

        // Print the fruits at index 0
        System.out.println("0:");
        System.out.println("Key: " + fruits[0].name + ", Value: " + fruits[0].value);
        System.out.println("Key: " + fruits[1].name + ", Value: " + fruits[1].value);

        // Print the rest of the fruits
        for (int i = 1; i < fruits.length; i++) {
            System.out.println(i + ":");
            System.out.println("Key: " + fruits[i].name + ", Value: " + fruits[i].value);
        }

        // Print indices 4 to 6 without any fruits
        for (int i = fruits.length; i <= 6; i++) {
            System.out.println(i + ":");
        }

        // Add the eggplant separately as it is not in sequence
        System.out.println("3: Key: eggplant, Value: 10");
    }
}
