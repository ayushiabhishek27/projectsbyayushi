public class PalindromeNumber {
    public static void main(String[] args) {
        int num = 121, original = num, rev = 0;

        while(num != 0){
            int digit = num % 10;
            rev = rev * 10 + digit;
            num /= 10;
        }

        System.out.println(original == rev ? "Palindrome" : "Not Palindrome");
    }
}
