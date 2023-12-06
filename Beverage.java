package bev2;


abstract class Beverage {
    private String name;
    private Type type;
    private Size size;
    private final double BASE_PRICE = 2.0;
    private final double SIZE_PRICE = 1.0;

    /** Constructors */
    public Beverage(String n, Type t, Size s) {
        name = n;
        type = t;
        size = s;
    }

    /** Utility */
    public abstract double calcPrice();

    public String toString() {
        return name + ", " + size;
    }

    public boolean equals(Beverage bev) {
        if (name.equals(bev.getBevName()) && type == bev.getType() && size == bev.getSize()) {
            return true;
        } else {
            return false;
        }
    }

    /** Accessors */
    public String getBevName() {
        return name;
    }

    public Type getType() {
        return type;
    }

    public Size getSize() {
        return size;
    }

    public double getBasePrice() {
        return BASE_PRICE;
    }

    public double getSizePrice() {
        return SIZE_PRICE;
    }

    /** Mutators */
    public void setName(String n) {
        name = n;
    }

    public void setType(Type t) {
        type = t;
    }

    public void setSize(Size s) {
        size = s;
    }
}