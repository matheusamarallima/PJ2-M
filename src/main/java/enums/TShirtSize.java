package enums;

public enum TShirtSize {

    XS("XSmall"), S("Small"), M("Medium"), L("Large"), XL("XLarge"), XXL("XXLarge");

    private final String TShirtSize;

    TShirtSize(String TShirtSize) {
        this.TShirtSize = TShirtSize;
    }

    public String getTShirtSize() {
        return TShirtSize;
    }
}
