import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RemovePeopleGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the card numbers (separated by spaces): ");
        String cardNumbersInput = scanner.nextLine();
        String[] cardNumbers = cardNumbersInput.split(" ");
        List<Integer> cards = new ArrayList<>();
        for (String cardNumber : cardNumbers) {
            cards.add(Integer.parseInt(cardNumber));
        }

        System.out.print("Enter the random number S: ");
        int s = scanner.nextInt();
        
        List<Integer> leftRemoved = removePeopleFromLeft(cards, s);
        List<Integer> rightRemoved = removePeopleFromRight(cards, s);

        System.out.println("Updated group after removing from the left side: " + leftRemoved);
        System.out.println("Updated group after removing from the right side: " + rightRemoved);
    }

    private static List<Integer> removePeopleFromLeft(List<Integer> cards, int s) {
        if (s >= cards.size()) {
            return new ArrayList<>();
        }
        return cards.subList(s, cards.size());
    }

    private static List<Integer> removePeopleFromRight(List<Integer> cards, int s) {
        if (s >= cards.size()) {
            return new ArrayList<>();
        }
        return cards.subList(0, cards.size() - s);
    }
}
