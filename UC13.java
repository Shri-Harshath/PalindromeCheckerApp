import java.util.Scanner;

class UC13 {

    static boolean reverseMethod(String str) {

        String reversed = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reversed = reversed + str.charAt(i);
        }

        return str.equals(reversed);
    }

    static boolean recursiveMethod(String str, int start, int end) {

        if (start >= end) {
            return true;
        }

        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }

        return recursiveMethod(str, start + 1, end - 1);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Palindrome Checker - Performance Comparison");

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        long startTime1 = System.nanoTime();
        boolean result1 = reverseMethod(input);
        long endTime1 = System.nanoTime();

        long startTime2 = System.nanoTime();
        boolean result2 = recursiveMethod(input, 0, input.length() - 1);
        long endTime2 = System.nanoTime();

        System.out.println("\nReverse Method Result: " + result1);
        System.out.println("Reverse Method Time: " + (endTime1 - startTime1) + " ns");

        System.out.println("\nRecursive Method Result: " + result2);
        System.out.println("Recursive Method Time: " + (endTime2 - startTime2) + " ns");

        sc.close();
    }
}