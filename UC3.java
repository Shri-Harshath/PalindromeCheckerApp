import java.util.Scanner;

class UC3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Palindrome Checker - String Reverse Method");

        System.out.print("Enter a word: ");
        String word = sc.nextLine();

        String reversed = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            reversed = reversed + word.charAt(i);
        }

        System.out.println("Original String : " + word);
        System.out.println("Reversed String : " + reversed);

        if (word.equals(reversed)) {
            System.out.println("Result: The string is a Palindrome");
        } else {
            System.out.println("Result: The string is NOT a Palindrome");
        }

        sc.close();
    }
}