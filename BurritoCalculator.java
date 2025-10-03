public class BurritoCalculator {
  public static boolean hasLeftoverFunds(int burritoCost) {
    int budgetInit = 100;
    int budgetLeft = budgetInit;
    boolean hasLeftovers = false;
    
    while (budgetLeft >= burritoCost) {
      budgetLeft -= burritoCost;
    }

    System.out.println("Remaining budget: " + budgetLeft);

    if (budgetInit - budgetLeft > 0) {
      hasLeftovers = true;
      }

      return hasLeftovers;
  }
    
  public static void main(String []args) {

    System.out.println(hasLeftoverFunds(7));
    System.out.println(hasLeftoverFunds(10));

  }
}
