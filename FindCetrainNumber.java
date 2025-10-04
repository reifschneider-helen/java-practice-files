public class FindCetrainNumber {
    public static boolean hasSpecialNumber(double[] groceryPrices) {
        boolean hasSpecialNumber = false;

        for (double item : groceryPrices) {
            item = Math.floor((item % 1) * 100);
            if (item == 99) {
                hasSpecialNumber = true;
            }
        }

        return hasSpecialNumber;
    }

    public static void main(String[] args) {
        double[] groceryList = { 10.0, 89.9, 8.99, 2.34 };

        System.out.println(hasSpecialNumber(groceryList));
    }
}