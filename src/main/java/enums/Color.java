package enums;

public enum Color {

    BLUE("Blue"), RED("Red"), GREEN("Green"), BLACK("Black"), WHITE("White");

    private final String color;

    Color(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}

