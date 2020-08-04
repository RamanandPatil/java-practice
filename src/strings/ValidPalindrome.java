package strings;

public class ValidPalindrome {
    public static void main(String[] args) {
        ValidPalindrome validPalindrome = new ValidPalindrome();
        String str = "A man, a plan, a canal: Panama";
        System.out.println(validPalindrome.isPalindrome(str));
        str = "race a car";
        System.out.println(validPalindrome.isPalindrome(str));
        str = "man121nam";
        System.out.println(validPalindrome.isPalindrome(str));
    }

    public boolean isPalindrome(String s) {
        if (s == null) {
            return false;
        }
        if (s.isEmpty() || s.isBlank()) {
            return true;
        }
        s = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        return s.equals(new StringBuilder(s).reverse().toString());
    }
}
