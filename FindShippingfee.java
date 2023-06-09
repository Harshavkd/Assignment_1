import java.util.Scanner;

public class ShippingFees {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the weight of electronic item X (in kgs): ");
        double weightX = scanner.nextDouble();

        System.out.print("Enter the weight of electronic item Y (in kgs): ");
        double weightY = scanner.nextDouble();

        System.out.print("Enter the weight of grocery item Z (in kgs): ");
        double weightZ = scanner.nextDouble();

        System.out.print("Enter the maximum weight for free shipping of electronic items (in kgs): ");
        double maxWeightElectronic = scanner.nextDouble();

        System.out.print("Enter the maximum weight for free shipping of grocery items (in kgs): ");
        double maxWeightGrocery = scanner.nextDouble();

        double shippingFees = calculateShippingFees(weightX, weightY, weightZ, maxWeightElectronic, maxWeightGrocery);

        if (shippingFees == 0) {
            System.out.println("Free Shipping");
        } else {
            System.out.println("Shipping Fees: INR " + shippingFees);
        }

        scanner.close();
    }

    public static double calculateShippingFees(double weightX, double weightY, double weightZ,
                                               double maxWeightElectronic, double maxWeightGrocery) {
        double electronicExcessWeight = Math.max(0, weightX + weightY - maxWeightElectronic);
        double groceryExcessWeight = Math.max(0, weightZ - maxWeightGrocery);

        double electronicShippingFees = electronicExcessWeight * 10;
        double groceryShippingFees = groceryExcessWeight * 15;

        return electronicShippingFees + groceryShippingFees;
    }
}
