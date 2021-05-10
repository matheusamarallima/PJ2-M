package entities;

import enums.Activity;
import enums.Materials;
import enums.PantsSize;

public class Pants extends ProductVar{

    Activity activity;
    Materials materials;
    PantsSize pantsSize;

    public Pants() {
    }

    public Pants(Activity activity, Materials materials, PantsSize pantsSize) {
        this.activity = activity;
        this.materials = materials;
        this.pantsSize = pantsSize;
    }

    public Activity getActivity() {
        return activity;
    }

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    public Materials getMaterials() {
        return materials;
    }

    public void setMaterials(Materials materials) {
        this.materials = materials;
    }

    public PantsSize getPantsSize() {
        return pantsSize;
    }

    public void setPantsSize(PantsSize pantsSize) {
        this.pantsSize = pantsSize;
    }

    @Override
    public String toString() {
        return "Pants{" +
                "activity=" + activity +
                ", materials=" + materials +
                ", pantsSize=" + pantsSize +
                '}';
    }
}
