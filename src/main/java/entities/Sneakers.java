package entities;

import enums.Activity;
import enums.Color;
import enums.Gender;
import enums.SneakersSize;

public class Sneakers extends ProductVar{

    Activity activity;
    SneakersSize sneakersSize;

    public Sneakers() {
    }

    public Sneakers(Color color, Gender gender, Activity activity, SneakersSize sneakersSize) {
        super(color, gender);
        this.activity = activity;
        this.sneakersSize = sneakersSize;
    }

    public Activity getActivity() {
        return activity;
    }

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    public SneakersSize getSneakersSize() {
        return sneakersSize;
    }

    public void setSneakersSize(SneakersSize sneakersSize) {
        this.sneakersSize = sneakersSize;
    }

    @Override
    public String toString() {
        return "Sneakers{" +
                "activity=" + activity +
                ", sneakersSize=" + sneakersSize +
                '}';
    }
}
