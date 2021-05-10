package enums;

public enum Materials {

    COTTON("Cotton"), SILK("Silk"), LINEN("Linen"), WOOL("Wool"), LEATHER("Leather");

    private final String materials;

    Materials(String materials) {
        this.materials = materials;
    }

    public String getMaterials() {
        return materials;
    }
}
