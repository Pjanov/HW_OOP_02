package automaticswitch.conductor;

import automaticswitch.automats.AV1P;

public class PuGV1_5mm extends Conductor{
    private final String SECTION = "1.5mm";

    public PuGV1_5mm(String manufacturer, String color) {
        super(manufacturer, color);
    }

    @Override
    public String toString() {
        return SECTION + " " + super.getColor();
    }

    @Override
    public String getSECTION() {
        return SECTION;
    }

}
