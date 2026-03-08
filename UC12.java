import java.util.Scanner;

interface PalindromeStrategy {
    boolean checkPalindrome(String str);
}

class ReverseStrategy implements PalindromeStrategy {

    public boolean checkPalindrome(String str) {

        String reversed = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reversed = reversed + str.charAt(i);
        }

        return str.equals(reversed);
    }
}

class UC12 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Palindrome Checker - Strategy Pattern");

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        PalindromeStrategy strategy = new ReverseStrategy();

        boolean result = strategy.checkPalindrome(input);

        if (result) {
            System.out.println("The string is a Palindrome.");
        } else {
            System.out.println("The string is NOT a Palindrome.");
        }

        sc.close();
    }
}