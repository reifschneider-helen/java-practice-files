import java.util.Arrays;

public class SortedList {
    public static String[] isAlphabetized(String[] groceryList) {

        for (int i = 0; i < groceryList.length - 1; i++) {
            int initIndex = i;

            for (int j = i + 1; j < groceryList.length - 1; j++) {
                if (groceryList[j].compareTo(groceryList[initIndex]) < 0) {
                    initIndex = j;
                }
            }

            String temp = groceryList[i];
            groceryList[i] = groceryList[initIndex];
            groceryList[initIndex] = temp;
        }
        return groceryList;
    }

    public static void main(String[] args) {
        String[] groceryList = { "apples", "chocolate", "bananas", "banana" };
        System.out.println(Arrays.toString(isAlphabetized(groceryList)));
    }
}
