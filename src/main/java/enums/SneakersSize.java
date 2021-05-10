package enums;

public enum SneakersSize {

    _38("38"), _40("40"), _42("42"), _44("44"), _46("46");

    private final String SneakersSize;

    SneakersSize(String sneakersSize) {
        SneakersSize = sneakersSize;
    }

    public String getSneakersSize() {
        return SneakersSize;
    }
}
