package codz.assignment.enums;

public enum ESize {
    L(3500, "Small"), M(2000, "Medium"), S(1000, "Small");

    public final int price;
    public final String label;

    ESize(int price, String label) {
        this.price = price;
        this.label = label;
    }
}
