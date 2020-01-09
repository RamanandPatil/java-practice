import java.util.Objects;

/**
 * Generic pairs
 *
 * Implement the generic class Pair which contains a pair of objects (of any
 * types). The objects can be null.
 *
 * You should implement the methods getFirst(), getSecond(), equals() and
 * hashCode() and the static method of() for creating instances as well. The
 * constructor must be private.
 *
 * Be careful with nulls when implementing equals() and hashCode().
 *
 * If your class has been implemented correctly, the following code should be
 * compiled and work successfully.
 *
 * Pair<Integer, String> pair = Pair.of(1, "hello");
 * Integer i = pair.getFirst(); // 1
 * String s = pair.getSecond(); // "hello"
 *
 * Pair<Integer, String> pair2 = Pair.of(1, "hello");
 * boolean mustBeTrue = pair.equals(pair2); // true!
 * boolean mustAlsoBeTrue = pair.hashCode() == pair2.hashCode(); // true!
 * Do not change the access modifier of the class Pair.
 */
public class GenericPairs {
    public static void main(String[] args) {
        Pair<Integer, String> pair = Pair.of(1, "hello");
        Integer i = pair.getFirst(); // 1
        String s = pair.getSecond(); // "hello"
        System.out.println("i = " + i + ", s = " + s);

        Pair<Integer, String> pair2 = Pair.of(1, "hello");
        boolean mustBeTrue = pair.equals(pair2); // true!
        System.out.println("mustBeTrue: " + mustBeTrue);
        boolean mustAlsoBeTrue = pair.hashCode() == pair2.hashCode(); // true!
        System.out.println("mustAlsoBeTrue: " + mustAlsoBeTrue);
    }
}


class Pair<T1, T2> {
    private T1 first;
    private T2 second;

    private Pair(T1 first, T2 second) {
        this.first = first;
        this.second = second;
    }

    public static <T1, T2> Pair<T1, T2> of(T1 first, T2 second) {
        return new Pair<T1, T2>(first, second);
    }

    public T1 getFirst() {
        return first;
    }

    public T2 getSecond() {
        return second;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Pair<?, ?> pair = (Pair<?, ?>) o;
        return Objects.equals(first, pair.first) &&
               Objects.equals(second, pair.second);
    }

    @Override
    public int hashCode() {
        return Objects.hash(first, second);
    }
}
