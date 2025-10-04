public class FindCertainLengthString {

    public static int getNumAllergicItems(String[] groceryList) {
        int numAllergicItems = 0;
        for (String item : groceryList) {
            if (item.length() > 5) {
                numAllergicItems++;
            }
        }

        return numAllergicItems;
    }

    public static void main(String[] args) {
        String[] groceryList = { "apple", "milk", "banana", "bananas", "chocolate" };

        System.out.println(getNumAllergicItems(groceryList));
    }
}
