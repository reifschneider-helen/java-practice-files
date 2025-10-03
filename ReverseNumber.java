// funktioniert nur fuer Zahlen ohne 0 am Anfang
// public class ReverseNumber {

//     public static int getReverseBudget(int budget) {
//         int reverseBudget = 0;

//         while (budget > 0) {
//             int digit = budget % 10;
//             reverseBudget = (reverseBudget * 10) + digit;
//             budget = budget / 10;
//         }

//         return reverseBudget;
//     }

//     public static void main(String[] args) {
//         System.out.println(getReverseBudget(256));
//     }
// }

public class ReverseNumber {

    public static int getReverseBudget(String budget) {
        String reverseBudget = "";

        for (char letter : budget.toCharArray()) {
            reverseBudget = letter + reverseBudget;
        }

        return Integer.parseInt(reverseBudget);
    }

    public static void main(String[] args) {
        System.out.println(getReverseBudget("0256"));
    }
}