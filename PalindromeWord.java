import java.util.Scanner;

public class PalindromeWord {

    static boolean isPalindrome(String str) {
        int i = 0;
        int j = str.length() - 1;

        while (i <= j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static boolean isPalindrome2(String str) {
        String reverse = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }

        System.out.println("Word: " + str);
        System.out.println("Reverse: " + reverse);
        return str.equals(reverse);

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter A Word: ");
        String word = input.nextLine();

        if (isPalindrome2(word)) {
            System.out.println(word + " is a palindromic word.");
        } else {
            System.out.println(word + " is not a palindromic word.");
        }
    }
}
