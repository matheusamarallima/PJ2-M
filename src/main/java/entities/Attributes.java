package entities;

import java.util.List;

public class Attributes {
    String atbName;
    List<Values> valuesList;


    public Attributes(String atbName, List<Values> valuesList) {
        this.atbName = atbName;
        this.valuesList = valuesList;
    }

    public Attributes() {

    }

    public String getAtbName() {
        return atbName;
    }

    public void setAtbName(String atbName) {
        this.atbName = atbName;
    }

    public List<Values> getValuesList() {
        return valuesList;
    }

    public void setValuesList(List<Values> valuesList) {
        this.valuesList = valuesList;
    }

    @Override
    public String toString() {
        return "Attributes{" +
                "atbName='" + atbName + '\'' +
                ", valuesList=" + valuesList +
                '}';
    }
}
