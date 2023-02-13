package automaticswitch.conductor;

import automaticswitch.automats.AV1P;

public abstract class Conductor {
    private String manufacturer;
    private String color;
    private String start;
    private String finish;
    abstract String getSECTION();

    public Conductor(String manufacturer, String color) {
        this.manufacturer = manufacturer;
        this.color = color;
    }

    public String toString() {
        return getSECTION() + " " + getColor();
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getFinish() {
        return finish;
    }

    public void setFinish(String finish) {
        this.finish = finish;
    }

    public String conductorStart(AV1P av) {
        setStart(av.getCONTACT_2());
        return "Начало: " + getStart();
    }

    public String conductorFinish(AV1P av) {
        setFinish(av.getCONTACT_1());
        return "Конец: " + getFinish();
    }

    public String jumperStart(AV1P av) {
        setStart(av.getCONTACT_1());
        return "Начало: " + getStart();
    }

    public String jumperFinish(AV1P av) {
        setFinish(av.getCONTACT_1());
        return "Конец: " + getFinish();
    }

    public String info() {
        return "ПуГВ " + getSECTION() +
                ": {откуда: " + start +
                ", куда: " + finish +
                ", цвет: " + color +
                ", производитель: " + manufacturer + '}';
    }
}
