package entities;

public class Values {


    String valueName;


    public Values() {
    }

    public Values(String valueName) {
        this.valueName = valueName;
    }

    public String getValueName() {
        return valueName;
    }

    public void setValueName(String valueName) {
        this.valueName = valueName;
    }

    @Override
    public String toString() {
        return "Values{" +
                "valueName='" + valueName + '\'' +
                '}';
    }
}
