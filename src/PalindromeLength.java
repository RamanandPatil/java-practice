import java.util.Arrays;
import java.util.Scanner;

/**
 * Raja loves Strings especially palindromes. Palindromes are strings that
 * read the same when read forward or backwards. Here only the palindromes of
 * even length (maybe 0) will be considered. His teacher gave him a long
 * string consisting of only digits as a gift on his birthday. Now Raja wants
 * to know the longest sub-array whose elements (i.e digits) can be
 * rearranged to form a palindrome of even length. Raja is unable to figure
 * out the solution to the problem so he asks for your help.
 *
 *
 * Input Format
 * You need to read first and only line of input consists of S.
 *
 *
 * Constraints
 * 1 <= |S| <= 100000
 *
 * Output Format
 * You must print a single integer denoting the length of longest sub-array
 * whose elements (digits) can be rearranged to form a palindrome of even
 * length. If no such sub-array can be found return 0.
 *
 *
 * Sample TestCase 1
 * Input
 * 12345354987
 * Output
 * 6
 * Explanation
 * Here the longest sub-array is 345354 which can be rearranged to form
 * 345543 which is a palindrome of even length 6. Hence the answer is 6.
 * Sample TestCase 2
 * Input
 * 12345
 * Output
 * 0
 * Explanation
 * No sub-array can be rearranged to form even length of palindrome. Hence 0.
 *
 * Time Limit(X):
 * 1.00 sec(s) for each input.
 * Memory Limit:
 * 512 MB
 * Source Limit:
 * 100 KB
 * Allowed Languages:
 * C, C++, C++11, C++14, C#, Java, Java 8, Kotlin, PHP, PHP 7, Python, Python
 * 3, Perl, Ruby, Node Js, Scala, Clojure, Haskell, Lua, Erlang, Swift,
 * VBnet, Js, Objc, Pascal, Go, F#, D, Groovy, Tcl, Ocaml, Smalltalk, Cobol,
 * Racket, Bash, GNU Octave, Rust, Common LISP, R, Julia, Fortran, Ada,
 * Prolog, Icon, Elixir, CoffeeScript, Brainfuck, Pypy, Lolcode, Nim,
 * Picolisp, Pike, pypy3
 *
 *
 * Judge Environment
 */
public class PalindromeLength {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();
        System.out.println(getEvenLongestPalindromicSubArray(word));
    }

    static int getEvenLongestPalindromicSubArray(String text) {
        int N = text.length();
        if (N == 0) {
            return N;
        }
        N = 2 * N + 1; // total positions count
        int[] L = new int[N + 1]; // LPS Length Array
        L[0] = 0;
        L[1] = 1;
        int C = 1; // centerPosition
        int R = 2; // centerRightPosition
        int i = 0; // currentRightPosition
        int iMirror; // currentLeftPosition
        int maxEvenLPSLength = 0;
        int diff = -1;

        for (i = 2; i < N; i++) {

            // get currentLeftPosition iMirror for currentRightPosition i
            iMirror = 2 * C - i;
            L[i] = 0;
            diff = R - i;

            // If currentRightPosition i is within centerRightPosition R
            if (diff > 0) {
                L[i] = Math.min(L[iMirror], diff);
            }

            // Attempt to expand palindrome centered at
            // currentRightPosition
            // i. Here for odd positions, we compare characters and if match
            // then increment LPS Length by ONE.
            // ii. If even position, we just increment LPS by ONE without any
            // character comparison
            while (((i + L[i]) + 1 < N && (i - L[i]) > 0) &&
                   (((i + L[i] + 1) % 2 == 0) ||
                    (text.charAt((i + L[i] + 1) / 2) ==
                     text.charAt((i - L[i] - 1) / 2)))) {
                L[i]++;
            }
            // If palindrome centered at currentRightPosition i
            // expand beyond centerRightPosition R,
            // adjust centerPosition C based on expanded palindrome.
            if (i + L[i] > R) {
                C = i;
                R = i + L[i];
            }
        }

        for (int j = 0; j < L.length; j++) {
            if (L[j] % 2 == 0 && maxEvenLPSLength < L[j]) {
                maxEvenLPSLength = L[j];
            }
        }
        System.out.println(Arrays.toString(L));
        return maxEvenLPSLength;
    }
}
