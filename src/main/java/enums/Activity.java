package enums;

public enum Activity {

    CASUALFIT("Casual"), SOCIALCLOTHING("Social Clothing"), GYM("Gym"), FOOTBALL("Football"),
    RUNNING("Running"), SWIMMING("Swimming");

    private final String activity;

    Activity(String activity) {
        this.activity = activity;
    }

    public String getActivity() {
        return activity;
    }

}
