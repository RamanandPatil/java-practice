/**
 * The company XYZ is hosting a cricket tournament for its employees. The
 * teams are to be built by different departments and the format of the
 * tournament will be knockout. The HR lead is busy with preparations and has
 * done all the promotions. The sponsors are very keen for the tournament and
 * have raised queries about it. The sponsors have asked about the number of
 * matches that needs to be played. Here is where the HR executive is unable
 * to help as he made all the preparations but forgot about the basic
 * questions. He badly needs your help to find the number of matches they
 * have to organize.
 *
 * The HR has provided you with the total number of teams(N) that registered
 * for the tournament. If there is any team left out to be paired then it
 * automatically gets promoted to the next round. Now it is only you who can
 * save the HR from embarrassment by solving the problem.
 *
 *
 *
 * Input Format
 * The first line of input consist of the number of test cases T.
 *
 * Next T lines consist of the number of teams participating in the
 * tournament, N.
 *
 *
 *
 * Constraints
 * 1<= T <=100
 *
 * 2<= N <=100000
 *
 *
 *
 * Output Format
 * For each test case, print the number of matches that have to be played.
 *
 * Sample TestCase 1
 * Input
 * 2
 * 4
 * 7
 * Output
 * 3
 * 6
 * Explanation
 * Test Case 1: N = 4 = 2 + 1 = 3
 *
 * Test Case 2: N = 7 = 3 + 2 + 1 = 6
 *
 *
 * Time Limit(X):
 * 0.50 sec(s) for each input.
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

import java.util.Scanner;

public class SportsTournament {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numOfTests = scanner.nextInt();
        while (numOfTests-- > 0) {
            int numOfTeams = scanner.nextInt();
            System.out.println(calculateKnockoutMatches(numOfTeams));
        }
    }

    private static int calculateKnockoutMatches(int numOfTeams) {
        if (numOfTeams <= 0) {
            return 0;
        }
        int totalMatches = numOfTeams / 2;
        while (numOfTeams > 1) {
            numOfTeams = ((numOfTeams / 2) + (numOfTeams % 2));
            totalMatches += (numOfTeams / 2);
        }
        return totalMatches;
    }
}
