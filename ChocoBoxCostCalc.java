import java.util.Scanner;

public class ChocolateBoxCost {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of chocolates liked: ");
        int chocolatesLiked = scanner.nextInt();

        System.out.print("Enter the number of chocolates disliked: ");
        int chocolatesDisliked = scanner.nextInt();

        int finalCost = calculateChocolateCost(chocolatesLiked, chocolatesDisliked);

        System.out.println("The final cost of the chocolate box is " + finalCost + " rupees.");

        scanner.close();
    }

    public static int calculateChocolateCost(int chocolatesLiked, int chocolatesDisliked) {
        int totalChocolates = chocolatesLiked + chocolatesDisliked;

        if (chocolatesLiked > totalChocolates / 2) {
            return chocolatesLiked;
        }

        int chocolatesToRemove = chocolatesDisliked - (totalChocolates / 2 - chocolatesLiked);

        int finalCost = chocolatesLiked - chocolatesToRemove;

        return finalCost;
    }
}
