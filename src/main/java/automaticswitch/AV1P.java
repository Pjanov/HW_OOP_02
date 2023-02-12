package automaticswitch;

abstract class AV1P implements General{
    private final int CONTACT_1 = 1;
    private final int CONTACT_2 = 2;
    String ON = "ВКЛЮЧЕН";
    String OFF = "ВЫКЛЮЧЕН";
    private String manufacturer;
    private String characteristic;

    public AV1P(String manufacturer, String characteristic) {
        this.manufacturer = manufacturer;
        this.characteristic = characteristic;
    }

    public int getCONTACT_1() {
        return CONTACT_1;
    }

    public int getCONTACT_2() {
        return CONTACT_2;
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
}
