import java.util.Scanner;

public class SumInRanges {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the space-separated numbers: ");
        String numbersInput = scanner.nextLine();
        String[] numbers = numbersInput.split(" ");

        System.out.print("Enter the number of ranges (M): ");
        int numberOfRanges = scanner.nextInt();

        int[][] ranges = new int[numberOfRanges][2];
        for (int i = 0; i < numberOfRanges; i++) {
            System.out.print("Enter range " + (i + 1) + " start: ");
            ranges[i][0] = scanner.nextInt();
            System.out.print("Enter range " + (i + 1) + " end: ");
            ranges[i][1] = scanner.nextInt();
        }

        for (int i = 0; i < numberOfRanges; i++) {
            int start = ranges[i][0];
            int end = ranges[i][1];
            int sum = computeRangeSum(numbers, start, end);
            System.out.println("Sum in range " + (i + 1) + ": " + sum);
        }
    }

    private static int computeRangeSum(String[] numbers, int start, int end) {
        int sum = 0;
        for (int i = start; i <= end; i++) {
            if (i >= 0 && i < numbers.length) {
                sum += Integer.parseInt(numbers[i]);
            }
        }
        return sum;
    }
}
