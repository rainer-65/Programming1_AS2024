package lecture03.exercises;

import java.time.*;

public class Car {
    private String make, model;
    private int year;


    public Car(String makeInit, String modelInit, int yearInit) {
        make = makeInit;
        model = modelInit;
        year = yearInit;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String makeUpdate) {
        make = makeUpdate;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String modelUpdate) {
        model = modelUpdate;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int yearUpdate) {
        year = yearUpdate;
    }

    public boolean isAntique() {
        return Year.now().getValue() - getYear() > 45;
    }

}
