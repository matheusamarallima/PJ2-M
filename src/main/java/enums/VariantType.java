package enums;

public enum VariantType {

    LONG("LONG"), SHORT("SHORT");

    private final String variantType;

    VariantType(String variantType) {
        this.variantType = variantType;
    }

    public String getVariantType() {
        return variantType;
    }



}
