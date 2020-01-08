/**
 * Pie company
 *
 * You are asked to help with Java programming in a Pie company.
 *
 * At the moment they bake and sell pies, cakes and tarts packed in nice
 * boxes. Unfortunately, approach to boxes programming is quite outdated –
 * each pie type requires its own box class. This approach is poorly scalable
 * and will turn the situation into a nightmare with product range growth
 * (imagine all these ApplePieBox, StrawberryPieBox, etc.).
 *
 * To avoid this implement universal Box class that will accommodate anything
 * with put and give it back with getters.
 *
 * Use the provided code template, don't remove existing classes.
 */
public class PieCompany {
    public static void main(String[] args) {
        Box<Cake> cakeBox = new Box<>();
        Box<Pie> pieBox = new Box<>();
        Box<Tart> tartBox = new Box<>();

        Cake cake = cakeBox.get();
        cakeBox.put(cake);
        Pie pie = pieBox.get();
        pieBox.put(pie);
        Tart tart = tartBox.get();
        tartBox.put(tart);
    }
}

class Cake {
}

class Pie {
}

class Tart {
}

/**
 * Box for cakes
 */
class CakeBox {

    private Cake cake;

    public void put(Cake cake) {
        this.cake = cake;
    }

    public Cake get() {
        return this.cake;
    }
}

/**
 * Box for pies
 */
class PieBox {

    private Pie pie;

    public void put(Pie pie) {
        this.pie = pie;
    }

    public Pie get() {
        return this.pie;
    }
}


/**
 * Box for tarts
 */
class TartBox {

    private Tart tart;

    public void put(Tart tart) {
        this.tart = tart;
    }

    public Tart get() {
        return this.tart;
    }
}

/*
    Hundred more such boring classes OR ...
    magic class for everything everybody is waiting for
*/
class Box<T> {
    private T box;

    public void put(T boxType) {
        this.box = boxType;
    }

    public T get(){
        return box;
    }
}
