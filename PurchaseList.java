import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ItemSales {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the space-separated prices
        System.out.print("Enter the space-separated prices: ");
        String pricesInput = scanner.nextLine();
        String[] prices = pricesInput.split(" ");

        // Find the items sold only once and more than once
        List<String> itemsSoldOnce = new ArrayList<>();
        List<String> itemsSoldMultipleTimes = new ArrayList<>();

        for (int i = 0; i < prices.length; i++) {
            String currentItem = prices[i];
            boolean isDuplicate = false;

            // Check if the item is already present in the itemsSoldOnce or itemsSoldMultipleTimes lists
            if (!itemsSoldOnce.contains(currentItem) && !itemsSoldMultipleTimes.contains(currentItem)) {
                // Check if the item is duplicated in the remaining prices
                for (int j = i + 1; j < prices.length; j++) {
                    if (currentItem.equals(prices[j])) {
                        isDuplicate = true;
                        break;
                    }
                }

                // Add the item to the appropriate list based on duplication status
                if (isDuplicate) {
                    itemsSoldMultipleTimes.add(currentItem);
                } else {
                    itemsSoldOnce.add(currentItem);
                }
            }
        }

        // Print the items sold only once
        System.out.println("Items sold only once:");
        if (itemsSoldOnce.isEmpty()) {
            System.out.println("No items sold only once.");
        } else {
            for (String item : itemsSoldOnce) {
                System.out.println(item);
            }
        }

        // Print the items sold more than once
        System.out.println("Items sold more than once:");
        if (itemsSoldMultipleTimes.isEmpty()) {
            System.out.println("No items sold more than once.");
        } else {
            for (String item : itemsSoldMultipleTimes) {
                System.out.println(item);
            }
        }
    }
}
