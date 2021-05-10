package entities;

import enums.*;

public class TShirt extends ProductVar{

    Activity activity;
    TShirtSize tShirtSize;
    Gender gender;
    VariantType variantType;

    public TShirt() {
    }

    public TShirt(Color color, Gender gender, Activity activity, TShirtSize tShirtSize, Gender gender1, VariantType variantType) {
        super(color, gender);
        this.activity = activity;
        this.tShirtSize = tShirtSize;
        this.gender = gender1;
        this.variantType = variantType;
    }

    public Activity getActivity() {
        return activity;
    }

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    public TShirtSize gettShirtSize() {
        return tShirtSize;
    }

    public void settShirtSize(TShirtSize tShirtSize) {
        this.tShirtSize = tShirtSize;
    }

    @Override
    public Gender getGender() {
        return gender;
    }

    @Override
    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public VariantType getVariantType() {
        return variantType;
    }

    public void setVariantType(VariantType variantType) {
        this.variantType = variantType;
    }

    @Override
    public String toString() {
        return "TShirt{" +
                "activity=" + activity +
                ", tShirtSize=" + tShirtSize +
                ", gender=" + gender +
                ", variantType=" + variantType +
                '}';
    }
}
