import java.util.Scanner;

class UC10 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Palindrome Checker - Ignore Case and Spaces");

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        String processed = input.toLowerCase().replaceAll(" ", "");

        String reversed = "";

        for (int i = processed.length() - 1; i >= 0; i--) {
            reversed = reversed + processed.charAt(i);
        }

        if (processed.equals(reversed)) {
            System.out.println("The string is a Palindrome.");
        } else {
            System.out.println("The string is NOT a Palindrome.");
        }

        sc.close();
    }
}