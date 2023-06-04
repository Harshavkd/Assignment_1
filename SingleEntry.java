import java.util.Scanner;

public class FindUniqueNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
      
        System.out.print("Enter the space-separated numbers: ");
        String numbersInput = scanner.nextLine();
        String[] numbers = numbersInput.split(" ");
      
        String uniqueNumber = findUniqueNumber(numbers);
        System.out.println("The number that appears exactly once is: " + uniqueNumber);
    }

    private static String findUniqueNumber(String[] numbers) {
        for (String number : numbers) {
            boolean isUnique = true;
            for (String otherNumber : numbers) {
                if (!number.equals(otherNumber)) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                return number;
            }
        }
        return null;
    }
}
