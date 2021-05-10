package entities;

import enums.Color;
import enums.Gender;

public class ProductVar {

    private Color color;
    private Gender gender;

    public ProductVar() {
    }

    public ProductVar(Color color, Gender gender) {
        this.color = color;
        this.gender = gender;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "ProductVar{" +
                "color=" + color +
                ", gender=" + gender +
                '}';
    }
}
