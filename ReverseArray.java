import java.util.Arrays;

public class ReverseArray {

    public static void reverseGroceries(String[] groceryList) {
        for (int i = 0; i < groceryList.length / 2; i++) {
            String temp = groceryList[groceryList.length - i - 1];
            groceryList[groceryList.length - i - 1] = groceryList[i];
            groceryList[i] = temp;
        }

        return;
    }

    public static void main(String[] args) {
        String[] groceryList = { "apples", "banana", "Apples", "chocolate", "oranges" };
        reverseGroceries(groceryList);

        for (String item : groceryList) {
            System.out.println(item);
        }
    }
}
