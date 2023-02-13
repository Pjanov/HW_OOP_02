package automaticswitch.conductor;

public class PuGV2_5mm extends Conductor{
    private final String SECTION = "2.5mm";

    public PuGV2_5mm(String manufacturer, String color) {
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
