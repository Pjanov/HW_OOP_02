package automaticswitch.automats;

public abstract class AV1P implements General {
    int CONTACT_1 = 1;
    int CONTACT_2 = 2;
    String ON = "ВКЛЮЧЕН";
    String OFF = "ВЫКЛЮЧЕН";
    private String manufacturer;
    private String characteristic;
    private String marking;

    public AV1P(String manufacturer, String characteristic, String marking) {
        this.manufacturer = manufacturer;
        this.characteristic = characteristic;
        this.marking = marking;
    }

    public String getCONTACT_1() {
        return getMarking() + "-" + CONTACT_1;
    }

    public String getCONTACT_2() {
        return getMarking() + "-" + CONTACT_2;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getCharacteristic() {
        return characteristic;
    }

    public void setCharacteristic(String characteristic) {
        this.characteristic = characteristic;
    }

    public String getON() {
        return ON;
    }

    public String getOFF() {
        return OFF;
    }

    @Override
    public String getMarking() {
        return marking;
    }

    public void setMarking(String marking) {
        this.marking = marking;
    }
}
