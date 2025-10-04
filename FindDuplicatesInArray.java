public class FindDuplicatesInArray {

  public static boolean hasDuplicates(String[] groceryList) {

    for (int i = 0; i < groceryList.length; i++) {
      for (int j = i + 1; j < groceryList.length; j++) {
        if (groceryList[i].compareToIgnoreCase(groceryList[j]) == 0) {
          return true;
        }
      }
    }
    return false;
  }

  public static void main(String[] args) {

    String[] groceryList = { "apples", "banana", "Apples", "chocolate" };
    System.out.println(hasDuplicates(groceryList));
  }
}
