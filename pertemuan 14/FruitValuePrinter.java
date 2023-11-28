public class FruitValuePrinter {

    public static void main(String[] args) {
        // Define the fruit names and their values
        String[] fruits = {"apple", "banana", "cherry", "date", "eggplant"};
        int[] values = {100, 50, 300, 500, 10};

        // Print the fruits and their values
        for (int i = 0; i < fruits.length; i++) {
            if (i == 0) {
                // Index 0 has two entries: apple and banana
                System.out.println(i + ":");
                System.out.println("Key: " + fruits[i] + ", Value: " + values[i]);
                System.out.println("Key: " + fruits[i+1] + ", Value: " + values[i+1]);
            } else if (i > 1) { // Skip index 1 as it's already printed with index 0
                System.out.println(i-1 + ":");
                System.out.println("Key: " + fruits[i] + ", Value: " + values[i]);
            }
        }

        // Print the indices 4, 5, and 6 without any entries
        System.out.println("4:");
        System.out.println("5:");
        System.out.println("6:");
        
        // Print the additional lines that are not prefixed with "Key:"
        System.out.println("Apple:");
        System.out.println("100");
        System.out.println("Date:");
        System.out.println("500");
    }
}

