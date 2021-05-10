package enums;

public enum PantsSize {
    XS("XSmall"),S("Small"),M("Medium"),L("Large"),XL("X Large"),XXL("XX Large"),XXXL("XXX Large");

    private final String PantsSize;


    PantsSize(String pantsSize) {
        PantsSize = pantsSize;
    }

    public String getPantsSize() {
        return PantsSize;
    }
}
