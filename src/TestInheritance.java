import java.util.List;

public class TestInheritance {
    public static void main(String[] args) {
        List<Integer> integerList = List.of(1, 2, 3, 4, 5);

        BaseClass clazz = new DerivedClass();
        clazz.print();

        char ch = '\u0031' + '\u0035';
        System.out.println(ch);
    }
}


class BaseClass {

    public void print() {
        System.out.println("Base class");
    }
}

class DerivedClass extends BaseClass {

    public void print() {
        System.out.println("Derived class");
        super.print();
    }
}
